package dev.wael.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;

import dev.wael.entities.Actor;
import dev.wael.entities.Director;
import dev.wael.entities.Movie;
import dev.wael.utils.HibernameUtil;

public class App {

	private static SessionFactory sf = HibernameUtil.getSessionFactory();

	public static void main(String args[]) {
		getAllActors();
		
		// criteriaQuery();
		//getDirectorById();
		// hqlQuery();

		// sqlQuery();
	}

	public static void criteriaQuery() {
		Session se = sf.openSession();
		Criteria crt = se.createCriteria(Director.class);
		crt.add(Restrictions.ilike("name", "%a%"));
		crt.add(Restrictions.between("dId", 2, 5));
		List<Director> lst = crt.list();
		System.out.println(lst);
		se.close();
	}

	public static void getDirectorById() {
		Session se = sf.openSession();
		Director mv = se.get(Director.class, 3);

		System.out.println(mv.getMovies());
		se.close();
	}

	public static void getAllActors()

	{
		Session se = sf.openSession();
		Criteria ct = se.createCriteria(Actor.class);
		List<Actor> lst = ct.list();
		System.out.println(lst);
		se.close();
	}

	public static void hqlQuery() {
		Session se = sf.openSession();
		String q = "from Director d where d.name ='Ali'";
		Query que = se.createQuery(q);
		List<Director> lst = que.list();
		System.out.println(lst);
		se.close();

	}

// non recmanded way in hibernate 
	public static void sqlQuery() {
		Session se = sf.openSession();
		String q = "select *  from director";
		Query sql = se.createSQLQuery(q);
		List<Director> lst = sql.list();
		System.out.println(lst);
		se.close();
	}

}
