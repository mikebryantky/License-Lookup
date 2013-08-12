package com.millcreeksoftware.amliclookup.hibernate;

import org.hibernate.Session;


/**
 * Data access interface for domain model
 * @author MyEclipse Persistence Tools
 */
public interface IBaseHibernateDAO {
	/**
	 * Gets the session.
	 * 
	 * @return The session.
	 */
	public Session getSession();
}