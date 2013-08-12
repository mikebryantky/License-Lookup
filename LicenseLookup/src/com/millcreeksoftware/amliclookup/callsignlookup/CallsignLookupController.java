
package com.millcreeksoftware.amliclookup.callsignlookup;

import java.util.Date;
import java.util.List;

import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.millcreeksoftware.amliclookup.callsignlookup.data.CallsignLookup;
import com.millcreeksoftware.amliclookup.callsignlookup.data.CallsignLookupDAO;
import com.millcreeksoftware.amliclookup.fcclookup.FccLookupData;
import com.millcreeksoftware.amliclookup.fcclookup.FccLookupHandler;
import com.millcreeksoftware.amliclookup.geolookup.GeoData;
import com.millcreeksoftware.amliclookup.geolookup.GeoHandler;
import com.millcreeksoftware.amliclookup.qrzlookup.QRZDatabase;
import com.millcreeksoftware.amliclookup.qrzlookup.QRZLookup;

/**
 * @author Mike Bryant
 */
@Controller
public class CallsignLookupController {

    /**
     * Gets the call sign search page.
     * 
     * @param model The Spring model.
     * 
     * @return The page to load.
     */
    @RequestMapping(value = "lookupCall.html")
    public String lookupCall(Model model) {
        return "lookupCall.jsp"; 
    }
    
    
    /**
     * Looks up a call sign.
     * 
     * @param callsign The call sign to lookup.
     * @param model    the Spring model.
     * 
     * @return The page to view: either 'lookup.jsp' or 'notFound.html'.
     */
    @RequestMapping(value = "lookupResults.html")
    public String lookup(@RequestParam String callsign, Model model) {
        String page = "lookupResults.jsp";
        
        QRZDatabase qrzData = QRZLookup.lookup(callsign);
        model.addAttribute("qrzData", qrzData);
        if(qrzData.isStatusOK()) {
            trackLookup(callsign);
            
            String address = new StringBuilder()
                .append(qrzData.getCallsign().getAddr1())
                .append(" ")
                .append(qrzData.getCallsign().getAddr2())
                .append(" ")
                .append(qrzData.getCallsign().getState())
                .append(" ")
                .append(qrzData.getCallsign().getZip())
                .toString();
        
            GeoData geoData = GeoHandler.getGeoData(address);
            model.addAttribute("geoData", geoData);            
        } else {
            page = "lookupNotFound.html";
        }
        
        model.addAttribute("callSign", callsign.toUpperCase());
        
        FccLookupData fccLookupData = FccLookupHandler.getFccData(callsign);
        model.addAttribute("fccLookupData", fccLookupData);
        
        return page;
    }
    
    
    /**
     * Controller for call signs that are not found.
     * 
     * @param model The Spring model
     * 
     * @return The page to display.
     */
    @RequestMapping(value = "lookupNotFound.html")
    public String notFound(Model model) {
        return "lookupNotFound.jsp";
    }

    
    /**
     * Gets the list of the most recent searches.
     * 
     * @param numRows The maximum number of rows to display.
     * @param model   The Spring model object.
     * 
     * @return The page to display.
     */
    @RequestMapping(value = "recentCallLookupList.html")
    public String getRecentLookups(@RequestParam int numRows, Model model) {
        CallsignLookupDAO dao = new CallsignLookupDAO();
        List<CallsignLookup> lookups = dao.getRecentLookups(numRows);
        
        model.addAttribute("lookups", lookups);
        
        return "recentCallLookupList.jsp";
    }
    
    
    /**
     * Stores the call in the database.
     * 
     * @param callsign The call sign to store.
     */
    private void trackLookup(String callsign) {
        CallsignLookup callLookup = new CallsignLookup();
        callLookup.setCallsign(callsign);
        callLookup.setLookupDate(new Date());
        
        CallsignLookupDAO dao = new CallsignLookupDAO();
        Transaction tx = dao.getSession().beginTransaction();
        dao.save(callLookup);
        tx.commit();
        dao.getSession().close();
    }
    
}
