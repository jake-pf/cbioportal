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

package org.mskcc.cbio.portal.mapback;

import java.util.ArrayList;

/**
 * Encapsulates information regarding GenBank Record:  U43746  for BRCA2.
 *
 * http://www.ncbi.nlm.nih.gov/nuccore/1161383
 *
 */
public class Brca2 extends MapBackGene {
    private final ArrayList <Mapping> mappingList;
    private final String dna;

    public Brca2() {
        //  Mapping List is Derived from UCSC Table Browser        
        mappingList = new ArrayList <Mapping>();
        mappingList.add(new Mapping(1,31787616,188));
        mappingList.add(new Mapping(189,31788558,106));
        mappingList.add(new Mapping(295,31791213,249));
        mappingList.add(new Mapping(544,31797212,109));
        mappingList.add(new Mapping(653,31798237,50));
        mappingList.add(new Mapping(703,31798378,41));
        mappingList.add(new Mapping(744,31798635,115));
        mappingList.add(new Mapping(859,31801579,50));
        mappingList.add(new Mapping(909,31803055,112));
        mappingList.add(new Mapping(1021,31804408,1116));
        mappingList.add(new Mapping(2137,31808401,4932));
        mappingList.add(new Mapping(7069,31816694,96));
        mappingList.add(new Mapping(7165,31818963,70));
        mappingList.add(new Mapping(7235,31826997,428));
        mappingList.add(new Mapping(7663,31828564,182));
        mappingList.add(new Mapping(7845,31829878,188));
        mappingList.add(new Mapping(8033,31834659,171));
        mappingList.add(new Mapping(8204,31835315,355));
        mappingList.add(new Mapping(8559,31842538,156));
        mappingList.add(new Mapping(8715,31843092,145));
        mappingList.add(new Mapping(8860,31848806,122));
        mappingList.add(new Mapping(8982,31851453,199));
        mappingList.add(new Mapping(9181,31851886,164));
        mappingList.add(new Mapping(9345,31852143,139));
        mappingList.add(new Mapping(9484,31866825,245));
        mappingList.add(new Mapping(9729,31869034,147));
        mappingList.add(new Mapping(9876,31870298,981));
        mappingList.add(new Mapping(10858,31871279,68));
        mappingList.add(new Mapping(10926,31871745,60));

        dna = "GGTGGCGCGAGCTTCTGAAACTAGGCGGCAGAGGCGGAGCCGCTGTGGCACTGCTGCGCCTCTGCTGCGC\n" +
                "CTCGGGTGTCTTTTGCGGCGGTGGGTCGCCGCCGGGAGAAGCGTGAGGGGACAGATTTGTGACCGGCGCG\n" +
                "GTTTTTGTCAGCTTACTCCGGCCAAAAAAGAACTGCACCTCTGGAGCGGACTTATTTACCAAGCATTGGA\n" +
                "GGAATATCGTAGGTAAAAATGCCTATTGGATCCAAAGAGAGGCCAACATTTTTTGAAATTTTTAAGACAC\n" +
                "GCTGCAACAAAGCAGATTTAGGACCAATAAGTCTTAATTGGTTTGAAGAACTTTCTTCAGAAGCTCCACC\n" +
                "CTATAATTCTGAACCTGCAGAAGAATCTGAACATAAAAACAACAATTACGAACCAAACCTATTTAAAACT\n" +
                "CCACAAAGGAAACCATCTTATAATCAGCTGGCTTCAACTCCAATAATATTCAAAGAGCAAGGGCTGACTC\n" +
                "TGCCGCTGTACCAATCTCCTGTAAAAGAATTAGATAAATTCAAATTAGACTTAGGAAGGAATGTTCCCAA\n" +
                "TAGTAGACATAAAAGTCTTCGCACAGTGAAAACTAAAATGGATCAAGCAGATGATGTTTCCTGTCCACTT\n" +
                "CTAAATTCTTGTCTTAGTGAAAGTCCTGTTGTTCTACAATGTACACATGTAACACCACAAAGAGATAAGT\n" +
                "CAGTGGTATGTGGGAGTTTGTTTCATACACCAAAGTTTGTGAAGGGTCGTCAGACACCAAAACATATTTC\n" +
                "TGAAAGTCTAGGAGCTGAGGTGGATCCTGATATGTCTTGGTCAAGTTCTTTAGCTACACCACCCACCCTT\n" +
                "AGTTCTACTGTGCTCATAGTCAGAAATGAAGAAGCATCTGAAACTGTATTTCCTCATGATACTACTGCTA\n" +
                "ATGTGAAAAGCTATTTTTCCAATCATGATGAAAGTCTGAAGAAAAATGATAGATTTATCGCTTCTGTGAC\n" +
                "AGACAGTGAAAACACAAATCAAAGAGAAGCTGCAAGTCATGGATTTGGAAAAACATCAGGGAATTCATTT\n" +
                "AAAGTAAATAGCTGCAAAGACCACATTGGAAAGTCAATGCCAAATGTCCTAGAAGATGAAGTATATGAAA\n" +
                "CAGTTGTAGATACCTCTGAAGAAGATAGTTTTTCATTATGTTTTTCTAAATGTAGAACAAAAAATCTACA\n" +
                "AAAAGTAAGAACTAGCAAGACTAGGAAAAAAATTTTCCATGAAGCAAACGCTGATGAATGTGAAAAATCT\n" +
                "AAAAACCAAGTGAAAGAAAAATACTCATTTGTATCTGAAGTGGAACCAAATGATACTGATCCATTAGATT\n" +
                "CAAATGTAGCACATCAGAAGCCCTTTGAGAGTGGAAGTGACAAAATCTCCAAGGAAGTTGTACCGTCTTT\n" +
                "GGCCTGTGAATGGTCTCAACTAACCCTTTCAGGTCTAAATGGAGCCCAGATGGAGAAAATACCCCTATTG\n" +
                "CATATTTCTTCATGTGACCAAAATATTTCAGAAAAAGACCTATTAGACACAGAGAACAAAAGAAAGAAAG\n" +
                "ATTTTCTTACTTCAGAGAATTCTTTGCCACGTATTTCTAGCCTACCAAAATCAGAGAAGCCATTAAATGA\n" +
                "GGAAACAGTGGTAAATAAGAGAGATGAAGAGCAGCATCTTGAATCTCATACAGACTGCATTCTTGCAGTA\n" +
                "AAGCAGGCAATATCTGGAACTTCTCCAGTGGCTTCTTCATTTCAGGGTATCAAAAAGTCTATATTCAGAA\n" +
                "TAAGAGAATCACCTAAAGAGACTTTCAATGCAAGTTTTTCAGGTCATATGACTGATCCAAACTTTAAAAA\n" +
                "AGAAACTGAAGCCTCTGAAAGTGGACTGGAAATACATACTGTTTGCTCACAGAAGGAGGACTCCTTATGT\n" +
                "CCAAATTTAATTGATAATGGAAGCTGGCCAGCCACCACCACACAGAATTCTGTAGCTTTGAAGAATGCAG\n" +
                "GTTTAATATCCACTTTGAAAAAGAAAACAAATAAGTTTATTTATGCTATACATGATGAAACATTTTATAA\n" +
                "AGGAAAAAAAATACCGAAAGACCAAAAATCAGAACTAATTAACTGTTCAGCCCAGTTTGAAGCAAATGCT\n" +
                "TTTGAAGCACCACTTACATTTGCAAATGCTGATTCAGGTTTATTGCATTCTTCTGTGAAAAGAAGCTGTT\n" +
                "CACAGAATGATTCTGAAGAACCAACTTTGTCCTTAACTAGCTCTTTTGGGACAATTCTGAGGAAATGTTC\n" +
                "TAGAAATGAAACATGTTCTAATAATACAGTAATCTCTCAGGATCTTGATTATAAAGAAGCAAAATGTAAT\n" +
                "AAGGAAAAACTACAGTTATTTATTACCCCAGAAGCTGATTCTCTGTCATGCCTGCAGGAAGGACAGTGTG\n" +
                "AAAATGATCCAAAAAGCAAAAAAGTTTCAGATATAAAAGAAGAGGTCTTGGCTGCAGCATGTCACCCAGT\n" +
                "ACAACATTCAAAAGTGGAATACAGTGATACTGACTTTCAATCCCAGAAAAGTCTTTTATATGATCATGAA\n" +
                "AATGCCAGCACTCTTATTTTAACTCCTACTTCCAAGGATGTTCTGTCAAACCTAGTCATGATTTCTAGAG\n" +
                "GCAAAGAATCATACAAAATGTCAGACAAGCTCAAAGGTAACAATTATGAATCTGATGTTGAATTAACCAA\n" +
                "AAATATTCCCATGGAAAAGAATCAAGATGTATGTGCTTTAAATGAAAATTATAAAAACGTTGAGCTGTTG\n" +
                "CCACCTGAAAAATACATGAGAGTAGCATCACCTTCAAGAAAGGTACAATTCAACCAAAACACAAATCTAA\n" +
                "GAGTAATCCAAAAAAATCAAGAAGAAACTACTTCAATTTCAAAAATAACTGTCAATCCAGACTCTGAAGA\n" +
                "ACTTTTCTCAGACAATGAGAATAATTTTGTCTTCCAAGTAGCTAATGAAAGGAATAATCTTGCTTTAGGA\n" +
                "AATACTAAGGAACTTCATGAAACAGACTTGACTTGTGTAAACGAACCCATTTTCAAGAACTCTACCATGG\n" +
                "TTTTATATGGAGACACAGGTGATAAACAAGCAACCCAAGTGTCAATTAAAAAAGATTTGGTTTATGTTCT\n" +
                "TGCAGAGGAGAACAAAAATAGTGTAAAGCAGCATATAAAAATGACTCTAGGTCAAGATTTAAAATCGGAC\n" +
                "ATCTCCTTGAATATAGATAAAATACCAGAAAAAAATAATGATTACATGAACAAATGGGCAGGACTCTTAG\n" +
                "GTCCAATTTCAAATCACAGTTTTGGAGGTAGCTTCAGAACAGCTTCAAATAAGGAAATCAAGCTCTCTGA\n" +
                "ACATAACATTAAGAAGAGCAAAATGTTCTTCAAAGATATTGAAGAACAATATCCTACTAGTTTAGCTTGT\n" +
                "GTTGAAATTGTAAATACCTTGGCATTAGATAATCAAAAGAAACTGAGCAAGCCTCAGTCAATTAATACTG\n" +
                "TATCTGCACATTTACAGAGTAGTGTAGTTGTTTCTGATTGTAAAAATAGTCATATAACCCCTCAGATGTT\n" +
                "ATTTTCCAAGCAGGATTTTAATTCAAACCATAATTTAACACCTAGCCAAAAGGCAGAAATTACAGAACTT\n" +
                "TCTACTATATTAGAAGAATCAGGAAGTCAGTTTGAATTTACTCAGTTTAGAAAACCAAGCTACATATTGC\n" +
                "AGAAGAGTACATTTGAAGTGCCTGAAAACCAGATGACTATCTTAAAGACCACTTCTGAGGAATGCAGAGA\n" +
                "TGCTGATCTTCATGTCATAATGAATGCCCCATCGATTGGTCAGGTAGACAGCAGCAAGCAATTTGAAGGT\n" +
                "ACAGTTGAAATTAAACGGAAGTTTGCTGGCCTGTTGAAAAATGACTGTAACAAAAGTGCTTCTGGTTATT\n" +
                "TAACAGATGAAAATGAAGTGGGGTTTAGGGGCTTTTATTCTGCTCATGGCACAAAACTGAATGTTTCTAC\n" +
                "TGAAGCTCTGCAAAAAGCTGTGAAACTGTTTAGTGATATTGAGAATATTAGTGAGGAAACTTCTGCAGAG\n" +
                "GTACATCCAATAAGTTTATCTTCAAGTAAATGTCATGATTCTGTTGTTTCAATGTTTAAGATAGAAAATC\n" +
                "ATAATGATAAAACTGTAAGTGAAAAAAATAATAAATGCCAACTGATATTACAAAATAATATTGAAATGAC\n" +
                "TACTGGCACTTTTGTTGAAGAAATTACTGAAAATTACAAGAGAAATACTGAAAATGAAGATAACAAATAT\n" +
                "ACTGCTGCCAGTAGAAATTCTCATAACTTAGAATTTGATGGCAGTGATTCAAGTAAAAATGATACTGTTT\n" +
                "GTATTCATAAAGATGAAACGGACTTGCTATTTACTGATCAGCACAACATATGTCTTAAATTATCTGGCCA\n" +
                "GTTTATGAAGGAGGGAAACACTCAGATTAAAGAAGATTTGTCAGATTTAACTTTTTTGGAAGTTGCGAAA\n" +
                "GCTCAAGAAGCATGTCATGGTAATACTTCAAATAAAGAACAGTTAACTGCTACTAAAACGGAGCAAAATA\n" +
                "TAAAAGATTTTGAGACTTCTGATACATTTTTTCAGACTGCAAGTGGGAAAAATATTAGTGTCGCCAAAGA\n" +
                "GTCATTTAATAAAATTGTAAATTTCTTTGATCAGAAACCAGAAGAATTGCATAACTTTTCCTTAAATTCT\n" +
                "GAATTACATTCTGACATAAGAAAGAACAAAATGGACATTCTAAGTTATGAGGAAACAGACATAGTTAAAC\n" +
                "ACAAAATACTGAAAGAAAGTGTCCCAGTTGGTACTGGAAATCAACTAGTGACCTTCCAGGGACAACCCGA\n" +
                "ACGTGATGAAAAGATCAAAGAACCTACTCTGTTGGGTTTTCATACAGCTAGCGGGAAAAAAGTTAAAATT\n" +
                "GCAAAGGAATCTTTGGACAAAGTGAAAAACCTTTTTGATGAAAAAGAGCAAGGTACTAGTGAAATCACCA\n" +
                "GTTTTAGCCATCAATGGGCAAAGACCCTAAAGTACAGAGAGGCCTGTAAAGACCTTGAATTAGCATGTGA\n" +
                "GACCATTGAGATCACAGCTGCCCCAAAGTGTAAAGAAATGCAGAATTCTCTCAATAATGATAAAAACCTT\n" +
                "GTTTCTATTGAGACTGTGGTGCCACCTAAGCTCTTAAGTGATAATTTATGTAGACAAACTGAAAATCTCA\n" +
                "AAACATCAAAAAGTATCTTTTTGAAAGTTAAAGTACATGAAAATGTAGAAAAAGAAACAGCAAAAAGTCC\n" +
                "TGCAACTTGTTACACAAATCAGTCCCCTTATTCAGTCATTGAAAATTCAGCCTTAGCTTTTTACACAAGT\n" +
                "TGTAGTAGAAAAACTTCTGTGAGTCAGACTTCATTACTTGAAGCAAAAAAATGGCTTAGAGAAGGAATAT\n" +
                "TTGATGGTCAACCAGAAAGAATAAATACTGCAGATTATGTAGGAAATTATTTGTATGAAAATAATTCAAA\n" +
                "CAGTACTATAGCTGAAAATGACAAAAATCATCTCTCCGAAAAACAAGATACTTATTTAAGTAACAGTAGC\n" +
                "ATGTCTAACAGCTATTCCTACCATTCTGATGAGGTATATAATGATTCAGGATATCTCTCAAAAAATAAAC\n" +
                "TTGATTCTGGTATTGAGCCAGTATTGAAGAATGTTGAAGATCAAAAAAACACTAGTTTTTCCAAAGTAAT\n" +
                "ATCCAATGTAAAAGATGCAAATGCATACCCACAAACTGTAAATGAAGATATTTGCGTTGAGGAACTTGTG\n" +
                "ACTAGCTCTTCACCCTGCAAAAATAAAAATGCAGCCATTAAATTGTCCATATCTAATAGTAATAATTTTG\n" +
                "AGGTAGGGCCACCTGCATTTAGGATAGCCAGTGGTAAAATCGTTTGTGTTTCACATGAAACAATTAAAAA\n" +
                "AGTGAAAGACATATTTACAGACAGTTTCAGTAAAGTAATTAAGGAAAACAACGAGAATAAATCAAAAATT\n" +
                "TGCCAAACGAAAATTATGGCAGGTTGTTACGAGGCATTGGATGATTCAGAGGATATTCTTCATAACTCTC\n" +
                "TAGATAATGATGAATGTAGCACGCATTCACATAAGGTTTTTGCTGACATTCAGAGTGAAGAAATTTTACA\n" +
                "ACATAACCAAAATATGTCTGGATTGGAGAAAGTTTCTAAAATATCACCTTGTGATGTTAGTTTGGAAACT\n" +
                "TCAGATATATGTAAATGTAGTATAGGGAAGCTTCATAAGTCAGTCTCATCTGCAAATACTTGTGGGATTT\n" +
                "TTAGCACAGCAAGTGGAAAATCTGTCCAGGTATCAGATGCTTCATTACAAAACGCAAGACAAGTGTTTTC\n" +
                "TGAAATAGAAGATAGTACCAAGCAAGTCTTTTCCAAAGTATTGTTTAAAAGTAACGAACATTCAGACCAG\n" +
                "CTCACAAGAGAAGAAAATACTGCTATACGTACTCCAGAACATTTAATATCCCAAAAAGGCTTTTCATATA\n" +
                "ATGTGGTAAATTCATCTGCTTTCTCTGGATTTAGTACAGCAAGTGGAAAGCAAGTTTCCATTTTAGAAAG\n" +
                "TTCCTTACACAAAGTTAAGGGAGTGTTAGAGGAATTTGATTTAATCAGAACTGAGCATAGTCTTCACTAT\n" +
                "TCACCTACGTCTAGACAAAATGTATCAAAAATACTTCCTCGTGTTGATAAGAGAAACCCAGAGCACTGTG\n" +
                "TAAACTCAGAAATGGAAAAAACCTGCAGTAAAGAATTTAAATTATCAAATAACTTAAATGTTGAAGGTGG\n" +
                "TTCTTCAGAAAATAATCACTCTATTAAAGTTTCTCCATATCTCTCTCAATTTCAACAAGACAAACAACAG\n" +
                "TTGGTATTAGGAACCAAAGTCTCACTTGTTGAGAACATTCATGTTTTGGGAAAAGAACAGGCTTCACCTA\n" +
                "AAAACGTAAAAATGGAAATTGGTAAAACTGAAACTTTTTCTGATGTTCCTGTGAAAACAAATATAGAAGT\n" +
                "TTGTTCTACTTACTCCAAAGATTCAGAAAACTACTTTGAAACAGAAGCAGTAGAAATTGCTAAAGCTTTT\n" +
                "ATGGAAGATGATGAACTGACAGATTCTAAACTGCCAAGTCATGCCACACATTCTCTTTTTACATGTCCCG\n" +
                "AAAATGAGGAAATGGTTTTGTCAAATTCAAGAATTGGAAAAAGAAGAGGAGAGCCCCTTATCTTAGTGGG\n" +
                "AGAACCCTCAATCAAAAGAAACTTATTAAATGAATTTGACAGGATAATAGAAAATCAAGAAAAATCCTTA\n" +
                "AAGGCTTCAAAAAGCACTCCAGATGGCACAATAAAAGATCGAAGATTGTTTATGCATCATGTTTCTTTAG\n" +
                "AGCCGATTACCTGTGTACCCTTTCGCACAACTAAGGAACGTCAAGAGATACAGAATCCAAATTTTACCGC\n" +
                "ACCTGGTCAAGAATTTCTGTCTAAATCTCATTTGTATGAACATCTGACTTTGGAAAAATCTTCAAGCAAT\n" +
                "TTAGCAGTTTCAGGACATCCATTTTATCAAGTTTCTGCTACAAGAAATGAAAAAATGAGACACTTGATTA\n" +
                "CTACAGGCAGACCAACCAAAGTCTTTGTTCCACCTTTTAAAACTAAATCACATTTTCACAGAGTTGAACA\n" +
                "GTGTGTTAGGAATATTAACTTGGAGGAAAACAGACAAAAGCAAAACATTGATGGACATGGCTCTGATGAT\n" +
                "AGTAAAAATAAGATTAATGACAATGAGATTCATCAGTTTAACAAAAACAACTCCAATCAAGCAGCAGCTG\n" +
                "TAACTTTCACAAAGTGTGAAGAAGAACCTTTAGATTTAATTACAAGTCTTCAGAATGCCAGAGATATACA\n" +
                "GGATATGCGAATTAAGAAGAAACAAAGGCAACGCGTCTTTCCACAGCCAGGCAGTCTGTATCTTGCAAAA\n" +
                "ACATCCACTCTGCCTCGAATCTCTCTGAAAGCAGCAGTAGGAGGCCAAGTTCCCTCTGCGTGTTCTCATA\n" +
                "AACAGCTGTATACGTATGGCGTTTCTAAACATTGCATAAAAATTAACAGCAAAAATGCAGAGTCTTTTCA\n" +
                "GTTTCACACTGAAGATTATTTTGGTAAGGAAAGTTTATGGACTGGAAAAGGAATACAGTTGGCTGATGGT\n" +
                "GGATGGCTCATACCCTCCAATGATGGAAAGGCTGGAAAAGAAGAATTTTATAGGGCTCTGTGTGACACTC\n" +
                "CAGGTGTGGATCCAAAGCTTATTTCTAGAATTTGGGTTTATAATCACTATAGATGGATCATATGGAAACT\n" +
                "GGCAGCTATGGAATGTGCCTTTCCTAAGGAATTTGCTAATAGATGCCTAAGCCCAGAAAGGGTGCTTCTT\n" +
                "CAACTAAAATACAGATATGATACGGAAATTGATAGAAGCAGAAGATCGGCTATAAAAAAGATAATGGAAA\n" +
                "GGGATGACACAGCTGCAAAAACACTTGTTCTCTGTGTTTCTGACATAATTTCATTGAGCGCAAATATATC\n" +
                "TGAAACTTCTAGCAATAAAACTAGTAGTGCAGATACCCAAAAAGTGGCCATTATTGAACTTACAGATGGG\n" +
                "TGGTATGCTGTTAAGGCCCAGTTAGATCCTCCCCTCTTAGCTGTCTTAAAGAATGGCAGACTGACAGTTG\n" +
                "GTCAGAAGATTATTCTTCATGGAGCAGAACTGGTGGGCTCTCCTGATGCCTGTACACCTCTTGAAGCCCC\n" +
                "AGAATCTCTTATGTTAAAGATTTCTGCTAACAGTACTCGGCCTGCTCGCTGGTATACCAAACTTGGATTC\n" +
                "TTTCCTGACCCTAGACCTTTTCCTCTGCCCTTATCATCGCTTTTCAGTGATGGAGGAAATGTTGGTTGTG\n" +
                "TTGATGTAATTATTCAAAGAGCATACCCTATACAGTGGATGGAGAAGACATCATCTGGATTATACATATT\n" +
                "TCGCAATGAAAGAGAGGAAGAAAAGGAAGCAGCAAAATATGTGGAGGCCCAACAAAAGAGACTAGAAGCC\n" +
                "TTATTCACTAAAATTCAGGAGGAATTTGAAGAACATGAAGAAAACACAACAAAACCATATTTACCATCAC\n" +
                "GTGCACTAACAAGACAGCAAGTTCGTGCTTTGCAAGATGGTGCAGAGCTTTATGAAGCAGTGAAGAATGC\n" +
                "AGCAGACCCAGCTTACCTTGAGGGTTATTTCAGTGAAGAGCAGTTAAGAGCCTTGAATAATCACAGGCAA\n" +
                "ATGTTGAATGATAAGAAACAAGCTCAGATCCAGTTGGAAATTAGGAAGGCCATGGAATCTGCTGAACAAA\n" +
                "AGGAACAAGGTTTATCAAGGGATGTCACAACCGTGTGGAAGTTGCGTATTGTAAGCTATTCAAAAAAAGA\n" +
                "AAAAGATTCAGTTATACTGAGTATTTGGCGTCCATCATCAGATTTATATTCTCTGTTAACAGAAGGAAAG\n" +
                "AGATACAGAATTTATCATCTTGCAACTTCAAAATCTAAAAGTAAATCTGAAAGAGCTAACATACAGTTAG\n" +
                "CAGCGACAAAAAAAACTCAGTATCAACAACTACCGGTTTCAGATGAAATTTTATTTCAGATTTACCAGCC\n" +
                "ACGGGAGCCCCTTCACTTCAGCAAATTTTTAGATCCAGACTTTCAGCCATCTTGTTCTGAGGTGGACCTA\n" +
                "ATAGGATTTGTCGTTTCTGTTGTGAAAAAAACAGGACTTGCCCCTTTCGTCTATTTGTCAGACGAATGTT\n" +
                "ACAATTTACTGGCAATAAAGTTTTGGATAGACCTTAATGAGGACATTATTAAGCCTCATATGTTAATTGC\n" +
                "TGCAAGCAACCTCCAGTGGCGACCAGAATCCAAATCAGGCCTTCTTACTTTATTTGCTGGAGATTTTTCT\n" +
                "GTGTTTTCTGCTAGTCCAAAAGAGGGCCACTTTCAAGAGACATTCAACAAAATGAAAAATACTGTTGAGA\n" +
                "ATATTGACATACTTTGCAATGAAGCAGAAAACAAGCTTATGCATATACTGCATGCAAATGATCCCAAGTG\n" +
                "GTCCACCCCAACTAAAGACTGTACTTCAGGGCCGTACACTGCTCAAATCATTCCTGGTACAGGAAACAAG\n" +
                "CTTCTGATGTCTTCTCCTAATTGTGAGATATATTATCAAAGTCCTTTATCACTTTGTATGGCCAAAAGGA\n" +
                "AGTCTGTTTCCACACCTGTCTCAGCCCAGATGACTTCAAAGTCTTGTAAAGGGGAGAAAGAGATTGATGA\n" +
                "CCAAAAGAACTGCAAAAAGAGAAGAGCCTTGGATTTCTTGAGTAGACTGCCTTTACCTCCACCTGTTAGT\n" +
                "CCCATTTGTACATTTGTTTCTCCGGCTGCACAGAAGGCATTTCAGCCACCAAGGAGTTGTGGCACCAAAT\n" +
                "ACGAAACACCCATAAAGAAAAAAGAACTGAATTCTCCTCAGATGACTCCATTTAAAAAATTCAATGAAAT\n" +
                "TTCTCTTTTGGAAAGTAATTCAATAGCTGACGAAGAACTTGCATTGATAAATACCCAAGCTCTTTTGTCT\n" +
                "GGTTCAACAGGAGAAAAACAATTTATATCTGTCAGTGAATCCACTAGGACTGCTCCCACCAGTTCAGAAG\n" +
                "ATTATCTCAGACTGAAACGACGTTGTACTACATCTCTGATCAAAGAACAGGAGAGTTCCCAGGCCAGTAC\n" +
                "GGAAGAATGTGAGAAAAATAAGCAGGACACAATTACAACTAAAAAATATATCTAAGCATTTGCAAAGGCG\n" +
                "ACAATAAATTATTGACGCTTAACCTTTCCAGTTTATAAGACTGGAATATAATTTCAAACCACACATTAGT\n" +
                "ACTTATGTTGCACAATGAGAAAAGAAATTAGTTTCAAATTTACCTCAGCGTTTGTGTATCGGGCAAAAAT\n" +
                "CGTTTTGCCCGATTCCGTATTGGTATACTTTTGCTTCAGTTGCATATCTTAAAACTAAATGTAATTTATT\n" +
                "AACTAATCAAGAAAAACATCTTTGGCTGAGCTCGGTGGCTCATGCCTGTAATCCCAACACTTTGAGAAGC\n" +
                "TGAGGTGGGAGGAGTGCTTGAGGCCAGGAGTTCAAGACCAGCCTGGGCAACATAGGGAGACCCCCATCTT\n" +
                "TACGAAGAAAAAAAAAAAGGGGAAAAGAAAATCTTTTAAATCTTTGGATTTGATCACTACAAGTATTATT\n" +
                "TTACAATCAACAAAATGGTCATCCAAACTCAAACTTGAGAAAATATCTTGCTTTCAAATTGACACTA";
    }

    public ArrayList<Mapping> getMappingList() {
        return mappingList;
    }

    public boolean isForwardStrand() {
        return true;
    }

    public String getFullDna() {
        return dna; 
    }
}

