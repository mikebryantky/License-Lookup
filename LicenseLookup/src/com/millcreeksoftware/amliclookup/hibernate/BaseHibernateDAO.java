package com.millcreeksoftware.amliclookup.hibernate;

import org.hibernate.Session;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
    
	/**
	 * Gets the session.
	 */
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}