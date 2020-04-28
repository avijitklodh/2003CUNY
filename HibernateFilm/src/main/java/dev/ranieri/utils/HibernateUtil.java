package dev.ranieri.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dev.ranieri.entities.Director;

public class HibernateUtil {
	
	
	private static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sf == null) {
			Configuration cfg = new Configuration();
			sf = cfg.configure().buildSessionFactory();
		}
		
		return sf;
	}

}
