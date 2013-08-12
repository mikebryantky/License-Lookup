package com.millcreeksoftware.amliclookup.callsignlookup.data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CallsignLookup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "callsign_lookup", catalog = "amateur_radio")
public class CallsignLookup extends AbstractCallsignLookup implements java.io.Serializable {

    private static final long serialVersionUID = -2996607532630683378L;
    
}
