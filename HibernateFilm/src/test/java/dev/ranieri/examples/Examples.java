package dev.ranieri.examples;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import dev.ranieri.entities.Actor;
import dev.ranieri.entities.Director;
import dev.ranieri.entities.Movie;
import dev.ranieri.utils.HibernateUtil;

public class Examples {
	
	private static SessionFactory sf = HibernateUtil.getSessionFactory();

	@Test
	public void getMovieById() {
		Session sess =sf.openSession();
		
		Movie m = sess.get(Movie.class, 3);
		
		sess.close();
		
		System.out.println(m.getDirector().getName());
		System.out.println("end");
	}
	
	@Test
	public void getDirectorById() {
		Session sess =sf.openSession(); 
		
		Director d = sess.get(Director.class, 2);		
		System.out.println(d);	
		System.out.println("Hello");
		sess.close();
			
	}
	
	// eager vs lazy loading
	// eager loading means that when you grab an object you will get all objects within it immediately
	// lazy loading means that you get a proxy object that does not contain the objects within it
	// When you lazy load the nested objects are not pull from the database until you call a method that
	// would use those nested objects
	
	@Test
	public void getDirectorEagerVsLazy() {
		Session sess =sf.openSession(); 
		
		Director d = sess.get(Director.class, 2);		
		
		System.out.println("Middle statement");
		System.out.println(d.getMovies());
		sess.close();
		
		// If you lazy load and you try to access objects that were not pulled into java
		// after you close the session you will get a lazyInitializationExcpetion
		System.out.println(d.getMovies());
	} 
	
	@Test
	public void getMoviesViaActor() {
		Session sess = sf.openSession();
		Actor tiffany = sess.get(Actor.class, 2);
		System.out.println(tiffany);
		System.out.println(tiffany.getMovies());		
		sess.close();
	}
	
	@Test
	public void getActorsViaMovie() {
		Session sess = sf.openSession();
		Movie m = sess.get(Movie.class, 5);
		System.out.println(m);
		System.out.println(m.getActors());
		sess.close();
	}
	

}
