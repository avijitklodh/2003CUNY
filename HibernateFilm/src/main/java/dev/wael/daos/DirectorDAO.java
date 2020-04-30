package dev.wael.daos;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.wael.entities.Director;
import dev.wael.utils.HibernameUtil;

public class DirectorDAO implements IDirectorDAO {
	private static SessionFactory sf = HibernameUtil.getSessionFactory();

	@Override
	public Director createDirector(Director dirctor) {

		try (Session ses = sf.openSession();) {
			try {
				ses.beginTransaction();
				ses.save(dirctor);
				ses.getTransaction().commit();
				ses.close();
			} catch (HibernateError er) {
				ses.getTransaction().rollback();
				er.printStackTrace();
			}
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
		return dirctor;

	}

	@Override
	public Director getDirectorById(int id) {
		Director director = new Director();
		try (Session ses = sf.openSession()) {

			director = ses.get(Director.class, id);
			ses.close();
		} catch (HibernateException ex) {

			ex.printStackTrace();
		}

		return director;
	}

	@Override
	public Director updateDirector(Director director) {
		try (Session ses = sf.openSession();) {
			try {
				ses.beginTransaction();
				ses.update(director);
				ses.getTransaction().commit();
				ses.close();
			} catch (HibernateError er) {
				ses.getTransaction().rollback();
				er.printStackTrace();
			}
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
		return director;
	}

	@Override
	public boolean deleteDirector(Director director) {
		// TODO Auto-generated method stub
		boolean result = true;
		try (Session ses = sf.openSession();) {
			try {
				ses.beginTransaction();
				ses.delete(director);
				ses.getTransaction().commit();
				ses.close();
			} catch (HibernateError er) {
				ses.getTransaction().rollback();
				er.printStackTrace();
				result = false;
			}
		} catch (HibernateException ex) {
			ex.printStackTrace();
			result = false;
		}
		return result;
	}

	@Override
	public Set<Director> getAllDirectors() {
		// Criteria interface

		Session se = sf.openSession();
		Criteria crt = se.createCriteria(Director.class);

		Set<Director> directors = new HashSet(crt.list());
		return  directors;
	}

}
