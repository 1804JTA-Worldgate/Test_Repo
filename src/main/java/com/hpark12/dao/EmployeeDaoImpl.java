package com.hpark12.dao;

import com.hpark12.model.EmployeeAnn;
import com.hpark12.model.EmployeeXML;
import com.hpark12.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDaoImpl implements EmployeeDao {

    public void insertEmployee(EmployeeXML emp) {

        Session session = HibernateUtil.getSession().openSession();
        Transaction t1 = null;
        try {
            t1 = session.beginTransaction();
            session.save(emp);
            t1.commit();
            // save and persist
        } catch (HibernateException h) {

        } finally {
            session.close();
        }

    }

    public void insertEmployeeAnn(EmployeeAnn emp) {

        Session session = HibernateUtil.getSession().openSession();
        Transaction t1 = null;
        try {
            t1 = session.beginTransaction();
            session.save(emp);
            t1.commit();
            // save and persist
        } catch (HibernateException h) {

        } finally {
            session.close();
        }

    }
}
