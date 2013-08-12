
package com.millcreeksoftware.amliclookup.geolookup;

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
public class GeoHandler {
    /**
     * Google geo URL prefix.
     */
    private static final String BASE_URL_PRE = "http://maps.google.com/maps/api/geocode/json?address=";
    
    /**
     * Google gro URL suffix.
     */
    private static final String BASE_URL_POST = "&sensor=false";
    
    /**
     * Log4J logger
     */
    private static Logger logger = Logger.getLogger(GeoHandler.class);
    
    
    /**
     * Gets the geographic data for the provided address.
     * 
     * @param address The address.
     * 
     * @return A populated <code>GeoData</code>.
     */
    public static GeoData getGeoData(String address) {
        GeoData geoData = new GeoData();
        
        String urlString = new StringBuilder().append(BASE_URL_PRE).append(address).append(BASE_URL_POST).toString();
        urlString = urlString.replaceAll(" ", "+");
        URL url;
        try {
            url = new URL(urlString);
            ObjectMapper m = new ObjectMapper();
            JsonNode rootNode = m.readValue(url.openStream(), JsonNode.class);
            
            String status = rootNode.path("status").textValue();
            if(!"OK".equalsIgnoreCase(status)) {
                return geoData;
            }

            geoData.setStatusOK(true);
            
            JsonNode resultsNode = rootNode.path("results");
            JsonNode arrayNode = resultsNode.path(0);
            JsonNode geometryNode = arrayNode.path("geometry");
            JsonNode locationNode = geometryNode.path("location");
            
            String lat = locationNode.path("lat").asText();
            geoData.setLatitude(lat);
            
            String lng = locationNode.path("lng").asText();
            geoData.setLongitude(lng);
        } catch (MalformedURLException e) {
            geoData.setStatusOK(false);
            logger.warn("Error looking up geo information for address '" + address + "'.", e);
        } catch (JsonParseException e) {
            geoData.setStatusOK(false);
            logger.warn("Error looking up geo information for address '" + address + "'.", e);
        } catch (JsonMappingException e) {
            geoData.setStatusOK(false);
            logger.warn("Error looking up geo information for address '" + address + "'.", e);
        } catch (IOException e) {
            geoData.setStatusOK(false);
            logger.warn("Error looking up geo information for address '" + address + "'.", e);
        }
        
        return geoData;
    }
    
}
