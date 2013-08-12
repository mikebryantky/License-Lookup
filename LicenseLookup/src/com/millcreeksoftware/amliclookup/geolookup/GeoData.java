
package com.millcreeksoftware.amliclookup.geolookup;

/**
 * @author Mike Bryant
 */
public class GeoData {
    private boolean statusOK = false;
    private String latitude;
    private String longitude;
    
    
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
     * @return the latitude
     */
    public String getLatitude() {
        return this.latitude;
    }
    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    /**
     * @return the longitude
     */
    public String getLongitude() {
        return this.longitude;
    }
    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    /* 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GeoData [statusOK=").append(this.statusOK).append(", latitude=").append(this.latitude)
                .append(", longitude=").append(this.longitude).append("]");
        return builder.toString();
    }
    /* 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.latitude == null) ? 0 : this.latitude.hashCode());
        result = prime * result + ((this.longitude == null) ? 0 : this.longitude.hashCode());
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
        GeoData other = (GeoData) obj;
        if (this.latitude == null) {
            if (other.latitude != null)
                return false;
        } else if (!this.latitude.equals(other.latitude))
            return false;
        if (this.longitude == null) {
            if (other.longitude != null)
                return false;
        } else if (!this.longitude.equals(other.longitude))
            return false;
        if (this.statusOK != other.statusOK)
            return false;
        return true;
    }
    
}
