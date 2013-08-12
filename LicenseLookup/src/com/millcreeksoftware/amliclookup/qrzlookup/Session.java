
package com.millcreeksoftware.amliclookup.qrzlookup;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * @author Mike Bryant
 */
@Root(name="Session", strict=false)
public class Session {
    @Element(name="Key")
    private String key;

    @Element(name="Count")
    private int count;
    
    @Element(name="SubExp")
    private String subExp;
    
    @Element(name="GMTime")
    private String gMTime;
    
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
    public int getCount() {
        return this.count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
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
     * @return the gMTime
     */
    public String getgMTime() {
        return this.gMTime;
    }

    /**
     * @param gMTime the gMTime to set
     */
    public void setgMTime(String gMTime) {
        this.gMTime = gMTime;
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
        builder.append("Session [key=").append(this.key).append(", count=").append(this.count).append(", subExp=")
                .append(this.subExp).append(", gMTime=").append(this.gMTime).append(", remark=").append(this.remark)
                .append("]");
        return builder.toString();
    }

    
    
}
