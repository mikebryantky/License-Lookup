

package com.millcreeksoftware.amliclookup.fcclookup;

/**
 * @author Mike Bryant
 */
public class FccLookupData {
    /**
     * Whether the call was succesful.
     */
    private boolean statusOK = false;
    
    private String lastUpdate;
    private String frn;
    private String statusDesc;
    private String expireDate;
    private String licenseId;
    private String fccUrl;
    
    

    /**
     * @return the statusOK
     */
    public boolean isStatusOK() {
        return this.statusOK;
    }
    /**
     * @param statusOK the statusOK to set
     */
    public void setStatusOK(boolean statusOK) {
        this.statusOK = statusOK;
    }
    /**
     * @return the lastUpdate
     */
    public String getLastUpdate() {
        return this.lastUpdate;
    }
    /**
     * @param lastUpdate the lastUpdate to set
     */
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    /**
     * @return the frn
     */
    public String getFrn() {
        return this.frn;
    }
    /**
     * @param frn the frn to set
     */
    public void setFrn(String frn) {
        this.frn = frn;
    }
    /**
     * @return the statusDesc
     */
    public String getStatusDesc() {
        return this.statusDesc;
    }
    /**
     * @param statusDesc the statusDesc to set
     */
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }
    /**
     * @return the expireDate
     */
    public String getExpireDate() {
        return this.expireDate;
    }
    /**
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    /**
     * @return the licenseId
     */
    public String getLicenseId() {
        return this.licenseId;
    }
    /**
     * @param licenseId the licenseId to set
     */
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
    /**
     * @return the fccUrl
     */
    public String getFccUrl() {
        return this.fccUrl;
    }
    /**
     * @param fccUrl the fccUrl to set
     */
    public void setFccUrl(String fccUrl) {
        this.fccUrl = fccUrl;
    }
    
    /* 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FccLookupData [statusOK=").append(this.statusOK).append(", lastUpdate=")
                .append(this.lastUpdate).append(", frn=").append(this.frn).append(", statusDesc=")
                .append(this.statusDesc).append(", expireDate=").append(this.expireDate).append(", licenseId=")
                .append(this.licenseId).append("]");
        return builder.toString();
    }

    /* 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.expireDate == null) ? 0 : this.expireDate.hashCode());
        result = prime * result + ((this.frn == null) ? 0 : this.frn.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        result = prime * result + ((this.licenseId == null) ? 0 : this.licenseId.hashCode());
        result = prime * result + ((this.statusDesc == null) ? 0 : this.statusDesc.hashCode());
        result = prime * result + (this.statusOK ? 1231 : 1237);
        return result;
    }

    /* 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FccLookupData other = (FccLookupData) obj;
        if (this.expireDate == null) {
            if (other.expireDate != null)
                return false;
        } else if (!this.expireDate.equals(other.expireDate))
            return false;
        if (this.frn == null) {
            if (other.frn != null)
                return false;
        } else if (!this.frn.equals(other.frn))
            return false;
        if (this.lastUpdate == null) {
            if (other.lastUpdate != null)
                return false;
        } else if (!this.lastUpdate.equals(other.lastUpdate))
            return false;
        if (this.licenseId == null) {
            if (other.licenseId != null)
                return false;
        } else if (!this.licenseId.equals(other.licenseId))
            return false;
        if (this.statusDesc == null) {
            if (other.statusDesc != null)
                return false;
        } else if (!this.statusDesc.equals(other.statusDesc))
            return false;
        if (this.statusOK != other.statusOK)
            return false;
        return true;
    }
    
}
