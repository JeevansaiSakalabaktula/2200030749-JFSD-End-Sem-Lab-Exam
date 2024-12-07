package com.klu.JFSD_exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            Transaction transaction = session.beginTransaction();

            String hql = "UPDATE Main SET name = ?1, location = ?2 WHERE id = ?3";
            int updatedEntities = session.createQuery(hql)
                    .setParameter(1, "Updated Department Name") 
                    .setParameter(2, "Updated Location")       
                    .setParameter(3, 1)                        
                    .executeUpdate();

            System.out.println("Number of rows updated: " + updatedEntities);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
