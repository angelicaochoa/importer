/*
 * Copyright (c) 2016 Memorial Sloan-Kettering Cancer Center.
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

package org.cbio.portal.pipelines.importer.model;

import java.util.*;

/**
 *
 * @author ochoaa
 */
public class CopyNumberSegmentRecord {
    
    private Integer cancerStudyId;
    private Integer sampleId;
    private String id;
    private String chrom;
    private String locStart;
    private String locEnd;
    private String numProbes;
    private String segMean;

    /**
     * @return the cancerStudyId
     */
    public Integer getCancerStudyId() {
        return cancerStudyId;
    }

    /**
     * @param cancerStudyId the cancerStudyId to set
     */
    public void setCancerStudyId(Integer cancerStudyId) {
        this.cancerStudyId = cancerStudyId;
    }

    /**
     * @return the sampleId
     */
    public Integer getSampleId() {
        return sampleId;
    }

    /**
     * @param sampleId the sampleId to set
     */
    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the chrom
     */
    public String getChrom() {
        return chrom;
    }

    /**
     * @param chrom the chrom to set
     */
    public void setChrom(String chrom) {
        this.chrom = chrom;
    }

    /**
     * @return the locStart
     */
    public String getLocStart() {
        return locStart;
    }

    /**
     * @param locStart the locStart to set
     */
    public void setLocStart(String locStart) {
        this.locStart = locStart;
    }

    /**
     * @return the locEnd
     */
    public String getLocEnd() {
        return locEnd;
    }

    /**
     * @param locEnd the locEnd to set
     */
    public void setLocEnd(String locEnd) {
        this.locEnd = locEnd;
    }

    /**
     * @return the numProbes
     */
    public String getNumProbes() {
        return numProbes;
    }

    /**
     * @param numProbes the numProbes to set
     */
    public void setNumProbes(String numProbes) {
        this.numProbes = numProbes;
    }

    /**
     * @return the segMean
     */
    public String getSegMean() {
        return segMean;
    }

    /**
     * @param segMean the segMean to set
     */
    public void setSegMean(String segMean) {
        this.segMean = segMean;
    }

    /**
     * @return the copy number segment staging data map (column -> field)
     */
    public HashMap<String, String> getCopyNumberSegmentStagingDataMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("ID", "id");
        map.put("chrom", "chrom");
        map.put("chromosome", "chrom");
        map.put("loc.start", "locStart");
        map.put("loc.end", "locEnd");
        map.put("num.mark", "numProbes");
        map.put("seg.mean", "segMean");

        return map;
    }

}
