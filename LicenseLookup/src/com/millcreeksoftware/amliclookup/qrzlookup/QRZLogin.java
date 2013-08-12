
package com.millcreeksoftware.amliclookup.qrzlookup;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/**
 * @author Mike Bryant
 */
public class QRZLogin {
    /**
     * Whether the call to login was successful.
     */
    private boolean statusOK = false;
    
    
    @Attribute(name="version")
    private String version;
    
    @Element(name="Session")
    private QRZLoginSession qrzLoginSession;

    /**
     * @return the qrzLoginSession
     */
    public QRZLoginSession getQrzLoginSession() {
        return this.qrzLoginSession;
    }

    /**
     * @param qrzLoginSession the qrzLoginSession to set
     */
    public void setQrzLoginSession(QRZLoginSession qrzLoginSession) {
        this.qrzLoginSession = qrzLoginSession;
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
        builder.append("QRZLogin [version=").append(this.version).append(", qrzLoginSession=")
                .append(this.qrzLoginSession).append("]");
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
