package dev.ranieri.daotests;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.ranieri.daos.DirectorDAO;
import dev.ranieri.daos.DirectorDAOHibernateImpl;
import dev.ranieri.entities.Director;

public class DirectorDAOtests {

	DirectorDAO ddao = new DirectorDAOHibernateImpl();
	
	@Test
	public void createDirector() {
		
		Director d = new Director (0,"Will Tarantino");
		ddao.createDirector(d);
	}

}
