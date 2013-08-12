
package com.millcreeksoftware.amliclookup.util;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


/**
 * Contains utilities to initiate Log4J logging.
 */
public final class LogUtils {
  
  /**
   * Determines whether the logger has been initialized already.
   */
  private static boolean isStarted = false;
  
  /**
   * The log4j config file to use.
   */
  private static final String CONFG_FILE = "log4j.xml"; 
  
  /**
   * The interval, in milliseconds, in which to reload the config file.
   */
  private static final long RELOAD_INTERVAL = 300000L; // five minutes
  
  
  /**
   * Fires up log4j logging services within the application. This method
   * <b>MUST</b> be called before the config file will be used. Before this
   * method is called, any log messages will be handled by whatever default
   * logging configuration (if any) log4j uses.
   */
  public static void startLogger() {
    if (LogUtils.isStarted) {
      return;
    }
    
    DOMConfigurator.configureAndWatch(LogUtils.CONFG_FILE, LogUtils.RELOAD_INTERVAL);
    Logger logger = Logger.getLogger(LogUtils.class);
    
    logger.info("Log4J started up and ready to go.  My configuration file is '" + LogUtils.CONFG_FILE
        + "'.  My configuration is reloaded every " + (LogUtils.RELOAD_INTERVAL / 1000) + " seconds.");
    
    LogUtils.isStarted = true;
    
    return;
  }
  
}