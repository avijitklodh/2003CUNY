package dev.ranieri.daos;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import dev.ranieri.entities.Director;
import dev.ranieri.utils.HibernateUtil;

public class DirectorDAOHibernateImpl implements DirectorDAO {
	
	private static SessionFactory sf = HibernateUtil.getSessionFactory();

	public Director createDirector(Director director) {
		
		Session sess = sf.openSession();
		
		sess.beginTransaction();
		sess.save(director);
		sess.getTransaction().commit();
		
		sess.close();
		return director;
	}

	public Director getDirectorById(int id) {
		
		Director d = null;
		try(Session sess = sf.openSession()){
			d= sess.get(Director.class, id);
		}catch(HibernateException he) {
			he.printStackTrace();
		}
		
		return d;
	}

	public Set<Director> getAllDirectors() {

		return null;
	}

	public Director updateDirector(Director director) {
	
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.update(director);		
		sess.getTransaction().commit();
		sess.close();
		return director;
	}

	public boolean deleteDirector(Director director) {
		
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.delete(director);
		sess.getTransaction().commit();
		sess.close();
		
		return true;
	}

}
