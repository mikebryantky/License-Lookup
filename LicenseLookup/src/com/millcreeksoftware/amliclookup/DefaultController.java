package com.millcreeksoftware.amliclookup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mike Bryant
 */
@Controller
public class DefaultController {

    /**
     * Index controller.
     * 
     * @param model The Spring model object.
     * 
     * @return The page to display.
     */
    @RequestMapping(value = "index.html")
    public String index(Model model) {
        return "index.jsp";
    }
    
    
    /**
     * Dipole Calculator controller.
     * 
     * @param model The Spring model object.
     * 
     * @return The page to display.
     */
    @RequestMapping(value = "dipoleCalculator.html")
    public String dipoleCalculator(Model model) {
        return "dipoleCalculator.jsp";
    }
    
}
