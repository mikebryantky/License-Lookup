
package com.millcreeksoftware.amliclookup.qrzlookup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * @author Mike Bryant
 */
public class QRZUtil {
    
    /**
     * Builds a <code>String</code> from the provided <code>InputStream</code>.
     * 
     * @param is The <code>InputStream</code> to convert to <code>String</code>.
     * 
     * @return The <code>String</code> to build.
     * 
     * @throws IOException If an error occurs.
     */
    public static String convertStreamToString(InputStream is)
            throws IOException {
        
        if (is != null) {
            Writer writer = new StringWriter();
            
            char[] buffer = new char[1024];
            try {
                Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                int n;
                while ((n = reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, n);
                }
            } finally {
                is.close();
            }
            return writer.toString();
        } else {       
            return "";
        }    
    }
    
}
