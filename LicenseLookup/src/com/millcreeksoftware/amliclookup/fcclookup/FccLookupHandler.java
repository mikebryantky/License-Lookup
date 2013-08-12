
package com.millcreeksoftware.amliclookup.fcclookup;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Mike Bryant
 */
public class FccLookupHandler {
    /**
     * Base URL for lookup up data.
     */
    public static final String FCC_LOOKUP_BASE_URL = "http://data.fcc.gov/api/license-view/basicSearch/getLicenses?format=json&searchValue=";
    
    /**
     * Base URL for FCC ULS page. 
     */
    public static final String FFC_MORE_INFO_BASE_URL = "http://wireless2.fcc.gov/UlsApp/UlsSearch/license.jsp?licKey=";
    
    /**
     * Log4J logger
     */
    private static Logger logger = Logger.getLogger(FccLookupHandler.class);
    
    
    /**
     * Gets the FCC data for the provided call sign.
     * 
     * @param callSign The call sign to lookup.
     * 
     * @return A populated <code>FccLookupData</code>.
     */
    public static FccLookupData getFccData(String callSign) {
        FccLookupData fccLookupData = new FccLookupData();
        
        URL url;
        try {
            url = new URL(FCC_LOOKUP_BASE_URL + callSign);
            ObjectMapper m = new ObjectMapper();
            JsonNode rootNode = m.readValue(url.openStream(), JsonNode.class);
            
            String status = rootNode.path("status").textValue();
            if(!"OK".equalsIgnoreCase(status)) {
                return fccLookupData;
            }

            fccLookupData.setStatusOK(true);
            
            JsonNode licensesNode = rootNode.path("Licenses");
            String lastUpdate = licensesNode.path("lastUpdate").asText();
            fccLookupData.setLastUpdate(lastUpdate);
            
            JsonNode licenseNode = licensesNode.path("License");
            JsonNode arrayNode = licenseNode.path(0);
            String frn = arrayNode.path("frn").asText();
            fccLookupData.setFrn(frn);
            
            String statusDesc = arrayNode.path("statusDesc").asText();
            fccLookupData.setStatusDesc(statusDesc);
            
            String expiredDate = arrayNode.path("expiredDate").asText();
            fccLookupData.setExpireDate(expiredDate);
            
            String licenseId = arrayNode.path("licenseID").asText();
            fccLookupData.setLicenseId(licenseId);
            
            fccLookupData.setFccUrl(FFC_MORE_INFO_BASE_URL + licenseId);
        } catch (MalformedURLException e) {
            fccLookupData.setStatusOK(false);
            logger.warn("Error looking up call '" + callSign + "'.", e);
        } catch (JsonParseException e) {
            fccLookupData.setStatusOK(false);
            logger.warn("Error looking up call '" + callSign + "'.", e);
        } catch (JsonMappingException e) {
            fccLookupData.setStatusOK(false);
            logger.warn("Error looking up call '" + callSign + "'.", e);
        } catch (IOException e) {
            fccLookupData.setStatusOK(false);
            logger.warn("Error looking up call '" + callSign + "'.", e);
        }
        
        return fccLookupData;
    }
    
}
