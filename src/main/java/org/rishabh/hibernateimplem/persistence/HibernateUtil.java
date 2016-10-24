package org.rishabh.hibernateimplem.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	public static final SessionFactory session = buildSessionFactory();
			
	public static SessionFactory buildSessionFactory(){
		try{
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
	}
	
	public static SessionFactory getSession() {
		return session;
	}

	public static void closeComponent(){
		session.close();
	}
}
