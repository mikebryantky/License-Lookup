
package com.millcreeksoftware.amliclookup.qrzlookup;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * @author Mike Bryant
 */
@Root(name="QRZDatabase", strict=false)
public class QRZDatabase {
    /**
     * Whether the call to build this object was successful.
     */
    private boolean statusOK = false;
    
    
    @Attribute(name="version")
    private String version;
    
    @Element(name="Callsign")
    private Callsign callsign;
    
    @Element(name="Session")
    private Session session;
    
    
    /**
     * Constructor. Just builds an empty child Callsign and Session class.
     */
    public QRZDatabase() {
        super();
    }
    
    /**
     * @return the call sign
     */
    public Callsign getCallsign() {
        return this.callsign;
    }
    /**
     * @param callsign the call sign to set
     */
    public void setCallsign(Callsign callsign) {
        this.callsign = callsign;
    }
    /**
     * @return the session
     */
    public Session getSession() {
        return this.session;
    }
    /**
     * @param session the session to set
     */
    public void setSession(Session session) {
        this.session = session;
    }
    
    /**
     * @return the version
     */
    public String getVersion() {
        return this.version;
    }
    
    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /* 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("QRZDatabase [version=").append(this.version).append(", callsign=").append(this.callsign)
                .append(", session=").append(this.session).append("]");
        return builder.toString();
    }
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
    
}
