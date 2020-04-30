package dev.wael.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

import dev.wael.entities.Director;
import dev.wael.entities.Movie;
import dev.wael.utils.HibernameUtil;

class MovieTest {

	private static SessionFactory sf = HibernameUtil.getSessionFactory();

	@Test
	void getMovieById() {
		Session se = sf.openSession();
		Movie  mv = se.get(Movie.class, 3);
	
		System.out.println(mv);	se.close();
	}
	@Test
	void getAllMovies() {
		Session se = sf.openSession();
		Criteria ct = se.createCriteria(Movie.class);
		List<Movie> lst = ct.list();
	 
	
		System.out.println(lst);	se.close();
	}
}
