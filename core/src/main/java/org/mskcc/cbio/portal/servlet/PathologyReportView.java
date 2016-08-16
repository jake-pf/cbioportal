/*
 * Copyright (c) 2015 Memorial Sloan-Kettering Cancer Center.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF MERCHANTABILITY OR FITNESS
 * FOR A PARTICULAR PURPOSE. The software and documentation provided hereunder
 * is on an "as is" basis, and Memorial Sloan-Kettering Cancer Center has no
 * obligations to provide maintenance, support, updates, enhancements or
 * modifications. In no event shall Memorial Sloan-Kettering Cancer Center be
 * liable to any party for direct, indirect, special, incidental or
 * consequential damages, including lost profits, arising out of the use of this
 * software and its documentation, even if Memorial Sloan-Kettering Cancer
 * Center has been advised of the possibility of such damage.
 */

/*
 * This file is part of cBioPortal.
 *
 * cBioPortal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.mskcc.cbio.portal.servlet;

import org.apache.log4j.Logger;
import org.mskcc.cbio.portal.dao.DaoCancerStudy;
import org.mskcc.cbio.portal.dao.DaoException;
import org.mskcc.cbio.portal.model.CancerStudy;
import org.mskcc.cbio.portal.util.AccessControl;
import org.mskcc.cbio.portal.util.GlobalProperties;
import org.mskcc.cbio.portal.util.SpringUtil;
import org.mskcc.cbio.portal.util.XDebug;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.net.URLDecoder;

/**
 * A servlet to respond to requests for Pathology Report files for cancer studies.
 * Adapted from CancerStudyView.java
 * 
 * @author Shaun Muscat
 */
public class PathologyReportView extends HttpServlet {
    private static Logger logger = Logger.getLogger(PathologyReportView.class);
    public static final String ERROR = "error";

    // class which process access control to cancer studies
    private AccessControl accessControl;

    // root directory of internal pathology reports or null if undefined
    private static final String DATA_DIRECTORY = GlobalProperties.getInternalPathReportRoot();
    
    /**
     * Initializes the servlet.
     *
     * @throws ServletException Serlvet Init Error.
     */
    @Override
    public void init() throws ServletException {
        super.init();
		accessControl = SpringUtil.getAccessControl();
    }
    
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        XDebug xdebug = new XDebug( request );
        request.setAttribute(QueryBuilder.XDEBUG_OBJECT, xdebug);
        
        try {            
            validateRequest(request);
            if (request.getAttribute(ERROR)!=null) {
                // ToDo: return 404 instead of error message so that a file resource is always returned (not file or html)
                // ToDo: alternatively fix the styling as it current tries to get the images and files from the relative current directory, rather than the web apps one
                forwardToErrorPage(request, response, (String)request.getAttribute(ERROR), xdebug);
            } else {
                File pathologyReport = new File(DATA_DIRECTORY, getRequestedPath(request));
                serveFile(response, pathologyReport);
            }
        } catch (DaoException e) {
            xdebug.logMsg(this, "Got Database Exception: " + e.getMessage());
            forwardToErrorPage(request, response, "An error occurred while trying to connect to the database.", xdebug);
        } catch (NoSuchFileException e) {
            xdebug.logMsg(this, "Got No Such File Exception: " + e.getMessage());
            forwardToErrorPage(request, response, "The requested pathology report could not be located.", xdebug);
        }
    }
    
    private String getRequestedPath(HttpServletRequest request) throws IOException{
        return URLDecoder.decode(request.getPathInfo().substring(1), "UTF-8");
    }
    
    private boolean validateRequest(HttpServletRequest request) throws IOException, DaoException {
        final String path = getRequestedPath(request);

        String cancerStudyID = path.split("/")[0];
        CancerStudy cancerStudy = DaoCancerStudy.getCancerStudyByStableId(cancerStudyID);
        if (cancerStudy==null) {
            try {
                cancerStudy = DaoCancerStudy.getCancerStudyByInternalId(Integer.parseInt(cancerStudyID));
            } catch(NumberFormatException ex) {
                logger.debug("PathologyReportView.validateRequest(): " + ex.getMessage());
            }
        }
        if (cancerStudy==null) {
            request.setAttribute(ERROR, "No such cancer study with id: '" + cancerStudyID + "'.");
            return false;
        }
        
        String cancerStudyIdentifier = cancerStudy.getCancerStudyStableId();
        if (accessControl.isAccessibleCancerStudy(cancerStudyIdentifier).size() != 1) {
            request.setAttribute(ERROR,
                "You are not authorized to access the cancer study with id: '" + cancerStudyIdentifier + "'. ");
            return false;
        }
        
        if (DATA_DIRECTORY == null) {
            request.setAttribute(ERROR, "The internal location of pathology reports is undefined");
            return false;
        }
        
        // Todo: incorporate some form of path validation so that arbitrary paths (such as study_id/../../sensitive.file) can't result in non-pathology report files being returned 
        File requestedFile = new File(DATA_DIRECTORY, path);
        if (!requestedFile.exists() || requestedFile.isDirectory()) {
            request.setAttribute(ERROR, "Unable to locate pathology report: '" + requestedFile.getName() + "' " +
                "for the cancer study with id: '" + cancerStudyIdentifier + "'.");
            return false;
        }
        
        return true;
    }
    
    private void serveFile(HttpServletResponse response, File file) throws IOException{
        logger.info("PathologyReportView.serveFile(): Serving file: " + file.getPath());
        response.setHeader("Content-Type", getServletContext().getMimeType(file.getName()));
        response.setHeader("Content-Length", String.valueOf(file.length()));
        response.setHeader("Content-Disposition", "inline; filename=\"" + file.getName() + "\"");
        Files.copy(file.toPath(), response.getOutputStream());
    }    
    
    private void forwardToErrorPage(HttpServletRequest request, HttpServletResponse response,
                                    String userMessage, XDebug xdebug)
            throws ServletException, IOException {
        request.setAttribute("xdebug_object", xdebug);
        request.setAttribute(QueryBuilder.USER_ERROR_MESSAGE, userMessage);
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher("/WEB-INF/jsp/error.jsp");
        dispatcher.forward(request, response);
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
