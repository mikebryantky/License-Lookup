package com.millcreeksoftware.amliclookup.callsignlookup.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

/**
 * AbstractCallsignLookup entity provides the base persistence definition of the
 * CallsignLookup entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractCallsignLookup extends com.millcreeksoftware.amliclookup.callsignlookup.data.BaseData implements
        java.io.Serializable {

    private static final long serialVersionUID = 7026483465470409005L;
    private Integer callsignLookupId;
    private String callsign;
    private Date lookupDate;
    
    
    /**
     * 
     * @return id
     */
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "callsign_lookup_id", unique = true, nullable = false)
    public Integer getCallsignLookupId() {
        return this.callsignLookupId;
    }
    
    /**
     * 
     * @param callsignLookupId
     */
    public void setCallsignLookupId(Integer callsignLookupId) {
        this.callsignLookupId = callsignLookupId;
    }

    /**
     * 
     * @return the call
     */
    @Column(name = "callsign", length = 50)
    public String getCallsign() {
        return this.callsign;
    }

    /**
     * 
     * @param callsign
     */
    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    /**
     * 
     * @return the date
     */
    @Column(name = "lookup_date", length = 19)
    public Date getLookupDate() {
        return this.lookupDate;
    }

    /**
     * 
     * @param lookupDate
     */
    public void setLookupDate(Date lookupDate) {
        this.lookupDate = lookupDate;
    }

}