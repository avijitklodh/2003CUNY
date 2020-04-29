package dev.ranieri.app;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import dev.ranieri.entities.Director;
import dev.ranieri.utils.HibernateUtil;

public class App {

	
	private static SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public static void main(String[] args) {
		
		//criteriaQuery();
		//hqlQuery();
		sqlQuery();

	}
	
	
	// there are three ways to make queries in hibernate
	// Criteria Interface (my favortie) very oop centric
	
	public static void criteriaQuery() {
		
		Session sess = sf.openSession();
		
		Criteria crit = sess.createCriteria(Director.class);
		
		//With Criteria you add resrtictions to it 
		// to make your query. THere is no limit to the amount of restrictions
		// % are wild cards
		crit.add(Restrictions.like("name","Will%"));
		crit.add(Restrictions.between("dId", 0, 3));
		
		List<Director> directors = crit.list();
		System.out.println(directors);
		sess.close();
	}
	
	
	// HQL query
	// Hibernate Query Language
	// an oop version of sql
	// like writing sql statements but regarding your classes in Java
	public static void hqlQuery() {
		
		Session sess = sf.openSession();
		
		// Director dylan= new Director()
		String hql = "FROM Director d WHERE d.name = 'Dylan Kubrick'";
		Query q = sess.createQuery(hql);
		
		List<Director> directors = q.list();
		System.out.println(directors);
		
		sess.close();
		
	}
	
	// SQL query
	// You can write sql like you would with jdbc
	// Least preferred option avoid if possible
	// Hibernate is not linked to a specific sql syntax
	// this makes hibernate applications very portable and able to be used on any database
	// if you write SQL directly and you change databases your application can break
	public static void sqlQuery() {
		
		String sql = "SELECT * FROM director";
		Session sess = sf.openSession();
		
		Query q = sess.createSQLQuery(sql);
		List<Director> directors = q.list();
		System.out.println(directors);

	}
	
	
	
	
}
