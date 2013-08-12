package com.millcreeksoftware.amliclookup.util;

import org.apache.log4j.Logger;

import com.millcreeksoftware.amliclookup.callsignlookup.data.CallsignLookupDAO;

/**
 * @author Mike Bryant
 */
public class DBRefresher implements Runnable {
	/**
	 * How long to sleep between db refreshes.
	 */
	private static final Long SLEEP_INTERVAL_MILLIS = 300000L;
	
	/**
	 * Log4J logger.
	 */
	private final Logger logger = Logger.getLogger(this.getClass());

	/**
	 * Sentinel which informs thread when to stop listening.
	 */
	private volatile boolean keepGoing = true;

	/*
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		logger.info("I will refresh the DB every " + (SLEEP_INTERVAL_MILLIS/1000) + " seconds.");
		
		while (this.keepGoing) {
			try {
				logger.debug("Sleeping " + (SLEEP_INTERVAL_MILLIS/1000) + " seconds.");
				Thread.sleep(10000);
				
				logger.debug("Looking up the most recent callsign search.");
		        new CallsignLookupDAO().getRecentLookups(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		logger.info("I am no longer refreshing the DB.");
		
		return;
	}
	

	/**
	 * Sets the sentinel value to tell the thread to stop running.
	 */
	public void suggestStop() {
		synchronized (this) {
			this.keepGoing = false;
		}
	}

}
