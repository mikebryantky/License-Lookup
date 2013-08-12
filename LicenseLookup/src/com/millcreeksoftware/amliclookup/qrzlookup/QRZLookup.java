
package com.millcreeksoftware.amliclookup.qrzlookup;

import java.io.InputStream;
import java.net.URL;

import org.apache.log4j.Logger;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.millcreeksoftware.amliclookup.util.AppProps;

/**
 * @author Mike Bryant
 */
public class QRZLookup {
    /**
     * Log4J logger
     */
    private static Logger logger = Logger.getLogger(QRZLookup.class);
    
    
    /**
     * Looks up a call sign via a QRZ XML.
     * 
     * @param callsign The call sign to lookup.
     * 
     * @return A populated <code>QRZDatabase</code>.
     */
    public static QRZDatabase lookup(String callsign) {
        String userName = AppProps.get("qrz.userName");
        String password = AppProps.get("qrz.password");
        String apiVersion = AppProps.get("qrz.apiVersion");
        
        QRZDatabase qrzData = new QRZDatabase();
        
        QRZLogin qrzLogin = QRZLoginHandler.login(userName, password, apiVersion);
        if(qrzLogin.isStatusOK()) {
            String sessionKey = qrzLogin.getQrzLoginSession().getKey();
            
            String url = new StringBuilder()
                .append("http://xmldata.qrz.com/xml/")
                .append(apiVersion)
                .append("/?s=")
                .append(sessionKey)
                .append("&callsign=")
                .append(callsign)
                .toString();
            
            Serializer serializer = new Persister();
            try {
                InputStream input = new URL(url).openStream();
                String data = QRZUtil.convertStreamToString(input);
                data = data.replaceAll("iso8859-1", "ISO-8859-1"); 
                
                qrzData = serializer.read(QRZDatabase.class, data);
                qrzData.setStatusOK(true);
            } catch (Exception e) {
                logger.warn("Error looking up call '" + callsign + "'.", e);
            }
        }
        
        return qrzData;
    }
    
}
