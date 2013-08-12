package com.millcreeksoftware.amliclookup.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 * Configures and provides access to Hibernate sessions, tied to the current
 * thread of execution. Follows the Thread Local Session pattern.
 */
public class HibernateSessionFactory {
    /**
     * Log4J logger
     */
    private static Logger logger = Logger.getLogger(HibernateSessionFactory.class);
    

    /**
     * Location of hibernate.cfg.xml file. Location should be on the class path
     * as Hibernate uses #resourceAsStream style lookup for its configuration
     * file. The default class path location of the hibernate config file is in
     * the default package. Use #setConfigFile() to update the location of the
     * configuration file for the current session.
     */
    private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
    private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    private static Configuration configuration = new AnnotationConfiguration();
    private static org.hibernate.SessionFactory sessionFactory;
    private static String configFile = CONFIG_FILE_LOCATION;

    static {
        try {
            configuration.configure(configFile);
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            logger.error("Error Creating SessionFactory", e);
        }
    }

    private HibernateSessionFactory() {
    }

    /**
     * Returns the ThreadLocal Session instance. Lazy initialize the
     * <code>SessionFactory</code> if needed.
     * 
     * @return Session
     * @throws HibernateException
     */
    public static Session getSession() throws HibernateException {
        Session session = (Session) threadLocal.get();

        if (session == null || !session.isOpen()) {
            if (sessionFactory == null) {
                rebuildSessionFactory();
            }
            session = (sessionFactory != null) ? sessionFactory.openSession() : null;
            threadLocal.set(session);
        }

        return session;
    }

    /**
     * Rebuild hibernate session factory
     * 
     */
    public static void rebuildSessionFactory() {
        try {
            configuration.configure(configFile);
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            logger.error("Error Creating SessionFactory", e);
        }
    }

    /**
     * Close the single hibernate session instance.
     * 
     * @throws HibernateException
     */
    public static void closeSession() throws HibernateException {
        Session session = (Session) threadLocal.get();
        threadLocal.set(null);

        if (session != null) {
            session.close();
        }
    }

    /**
     * return session factory
     * 
     * @return the session factory
     * 
     */
    public static org.hibernate.SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * session factory will be rebuilt in the next call
     * 
     * @param configFile
     *            return session factory
     */
    public static void setConfigFile(String configFile) {
        HibernateSessionFactory.configFile = configFile;
        sessionFactory = null;
    }

    /**
     * return hibernate configuration
     * 
     * @return the configuration
     */
    public static Configuration getConfiguration() {
        return configuration;
    }

}