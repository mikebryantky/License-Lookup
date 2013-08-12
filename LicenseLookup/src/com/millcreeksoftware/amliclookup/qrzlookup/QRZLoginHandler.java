package com.millcreeksoftware.amliclookup.qrzlookup;

import java.io.InputStream;
import java.net.URL;

import org.apache.log4j.Logger;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 * @author Mike Bryant
 */
public class QRZLoginHandler {
    /**
     * Log4J logger
     */
    private static Logger logger = Logger.getLogger(QRZLoginHandler.class);
        
        
    /**
     * Registers (logs in) a session with QRZ.com.
     * 
     * @param userName The user name to use to login.
     * @param password The password to use to login.
     * @param apiVersion The version of the QRZ API we are using.
     * 
     * @return A <code>QRZLogin</code> object populated with session information.
     */
    public static QRZLogin login(String userName, String password, String apiVersion) {
        QRZLogin qrzLogin = new QRZLogin();

        String url = new StringBuilder()
            .append("http://xmldata.qrz.com/xml/")
            .append(apiVersion)
            .append("/")
            .append("?username=")
            .append(userName)
            .append("&password=")
            .append(password)
            .toString();
        
        Serializer serializer = new Persister();
        try {
            InputStream input = new URL(url).openStream();
            String data = QRZUtil.convertStreamToString(input);
            data = data.replaceAll("iso8859-1", "ISO-8859-1"); 
            
            qrzLogin = serializer.read(QRZLogin.class, data);
            qrzLogin.setStatusOK(true);
        } catch (Exception e) {
            logger.warn("Could not login to QRZ.", e);
        }

        return qrzLogin;
    }
    
}
