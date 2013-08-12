package com.millcreeksoftware.amliclookup.callsignlookup.data;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.apache.log4j.Logger;
import static org.hibernate.criterion.Example.create;


import com.millcreeksoftware.amliclookup.hibernate.BaseHibernateDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * CallsignLookup entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.millcreeksoftware.amliclookup.callsignlookup.data.CallsignLookup
 * @author MyEclipse Persistence Tools
 */

public class CallsignLookupDAO extends BaseHibernateDAO {
    private static final Logger log = Logger.getLogger(CallsignLookupDAO.class);

    /**
     * call sign
     */
    public static final String CALLSIGN = "callsign";

    
    /**
     * Gets a list of recent searches.
     * 
     * @param maxRows The max number of rows do return. If less 
     *                  than or equal to zero then returns all rows.
     * 
     * @return The <code>List<CallsignLookup></code> with most recent searches.
     */
    @SuppressWarnings("unchecked")
    public List<CallsignLookup> getRecentLookups(int maxRows) {
        try {
            String queryString = "from CallsignLookup order by lookupDate desc";
            Query queryObject = getSession().createQuery(queryString);
            
            if(maxRows > 0) {
                queryObject.setMaxResults(maxRows);
            }
            
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("getRecentLookups", re);
            throw re;
        }
    }
    
    
    /**
     * 
     * @param transientInstance
     */
    public void save(CallsignLookup transientInstance) {
        log.debug("saving CallsignLookup instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    /**
     * 
     * @param persistentInstance
     */
    public void delete(CallsignLookup persistentInstance) {
        log.debug("deleting CallsignLookup instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }

    /**
     * 
     * @param id
     * 
     * @return the call sign
     */
    public CallsignLookup findById(java.lang.Integer id) {
        log.debug("getting CallsignLookup instance with id: " + id);
        try {
            CallsignLookup instance = (CallsignLookup) getSession().get(
                    "com.millcreeksoftware.amliclookup.callsignlookup.data.CallsignLookup", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    /**
     * 
     * @param instance
     * 
     * @return the call signs
     */
    @SuppressWarnings("unchecked")
    public List<CallsignLookup> findByExample(CallsignLookup instance) {
        log.debug("finding CallsignLookup instance by example");
        try {
            List<CallsignLookup> results = (List<CallsignLookup>) getSession()
                    .createCriteria("com.millcreeksoftware.amliclookup.callsignlookup.data.CallsignLookup").add(create(instance))
                    .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }

    /**
     * 
     * @param propertyName
     * @param value
     * @return the list
     */
    @SuppressWarnings("unchecked")
    public List<CallsignLookup> findByProperty(String propertyName, Object value) {
        log.debug("finding CallsignLookup instance with property: " + propertyName + ", value: " + value);
        try {
            String queryString = "from CallsignLookup as model where model." + propertyName + "= ?";
            Query queryObject = getSession().createQuery(queryString);
            queryObject.setParameter(0, value);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by property name failed", re);
            throw re;
        }
    }

    /**
     * 
     * @param callsign
     * @return the list
     */
    public List<CallsignLookup> findByCallsign(Object callsign) {
        return findByProperty(CALLSIGN, callsign);
    }

    /**
     * 
     * @return the calls
     */
    @SuppressWarnings("unchecked")
    public List<CallsignLookup> findAll() {
        log.debug("finding all CallsignLookup instances");
        try {
            String queryString = "from CallsignLookup";
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
    }

    /**
     * 
     * @param detachedInstance
     * @return the object
     */
    public CallsignLookup merge(CallsignLookup detachedInstance) {
        log.debug("merging CallsignLookup instance");
        try {
            CallsignLookup result = (CallsignLookup) getSession().merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    /**
     * 
     * @param instance
     */
    public void attachDirty(CallsignLookup instance) {
        log.debug("attaching dirty CallsignLookup instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

    /**
     * 
     * @param instance
     */
    public void attachClean(CallsignLookup instance) {
        log.debug("attaching clean CallsignLookup instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

}