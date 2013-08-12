package com.millcreeksoftware.amliclookup.util;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

/**
 * @author Mike Bryant
 */
public class ContextListener implements ServletContextListener {
	/** Log4J logger. */
	private final Logger logger = Logger.getLogger(this.getClass());
	
	  /** The db refresher runner. */
	  private Runnable dbRefresherRunner = new DBRefresher();
	  
	  /** The db refresher thread. */
	  private Thread dbRefresherThread;
	  
	  
	/*
	 * @see
	 * javax.servlet.ServletContextListener#contextInitialized(javax.servlet
	 * .ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent cxtEvent) {
		// Start Logger
		LogUtils.startLogger();
		
	    // Track when this app was started.
	    cxtEvent.getServletContext().setAttribute("appStartTime", new Date());
	    
	    // Fire up DB Refresher
	    this.logger.info("Starting DB Refresher.");
	    this.dbRefresherThread = new Thread(this.dbRefresherRunner);
	    this.dbRefresherThread.setDaemon(true);
	    this.dbRefresherThread.start();
	}

	/*
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.
	 * ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent cxtEvent) {
	    this.logger.info("Shutting down DB Refresher.");
	    ((DBRefresher) this.dbRefresherRunner).suggestStop();
	    this.dbRefresherThread.interrupt();
	}

}
