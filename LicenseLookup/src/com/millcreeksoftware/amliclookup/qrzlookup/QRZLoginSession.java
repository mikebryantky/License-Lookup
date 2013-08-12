
package com.millcreeksoftware.amliclookup.qrzlookup;

import org.simpleframework.xml.Element;

/**
 * @author Mike Bryant
 */
public class QRZLoginSession {
    @Element(name="Key")
    private String key;
    
    @Element(name="Count")
    private String count;
    
    @Element(name="SubExp")
    private String subExp;
    
    @Element(name="GMTime")
    private String gmtTime;
    
    @Element(name="Remark")
    private String remark;
    
    
    /**
     * @return the key
     */
    public String getKey() {
        return this.key;
    }
    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }
    /**
     * @return the count
     */
    public String getCount() {
        return this.count;
    }
    /**
     * @param count the count to set
     */
    public void setCount(String count) {
        this.count = count;
    }
    /**
     * @return the subExp
     */
    public String getSubExp() {
        return this.subExp;
    }
    /**
     * @param subExp the subExp to set
     */
    public void setSubExp(String subExp) {
        this.subExp = subExp;
    }
    /**
     * @return the gmtTime
     */
    public String getGmtTime() {
        return this.gmtTime;
    }
    /**
     * @param gmtTime the gmtTime to set
     */
    public void setGmtTime(String gmtTime) {
        this.gmtTime = gmtTime;
    }
    /**
     * @return the remark
     */
    public String getRemark() {
        return this.remark;
    }
    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    /* 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("QRZLoginSession [key=").append(this.key).append(", count=").append(this.count)
                .append(", subExp=").append(this.subExp).append(", gmtTime=").append(this.gmtTime).append(", remark=")
                .append(this.remark).append("]");
        return builder.toString();
    }
    
}
