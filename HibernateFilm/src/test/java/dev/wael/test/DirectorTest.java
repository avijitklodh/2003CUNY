package dev.wael.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import dev.wael.daos.DirectorDAO;
import dev.wael.entities.Director;
import dev.wael.utils.HibernameUtil;

class DirectorTest {
	HibernameUtil ht = new HibernameUtil();
	DirectorDAO directorDAO = new DirectorDAO();

	@Test
	void test() {

		// ht.getDirectorById(3);
	}

	@Test
	public void createDirector() {
		directorDAO.createDirector(new Director(0, "Direcortest"));
	}

	@Test
	public void getDirectorById() {
		Director dr = directorDAO.getDirectorById(5);
		System.out.println(dr.toString());
	}
 	@Test
	public void getAllDirectors() {
 		Set<Director> directors = directorDAO.getAllDirectors();
		System.out.println(directors);
	}
 	@Test
	public void getAllDirectorsEager() {
 		Set<Director> directors = directorDAO.getAllDirectors();
		System.out.println(directors);
	}
}