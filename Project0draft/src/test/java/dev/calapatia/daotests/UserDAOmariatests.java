package dev.calapatia.daotests;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.calapatia.daos.UserDAO;
import dev.calapatia.daos.UserDAOmaria;
import dev.calapatia.entities.User;
//import dev.ranieri.entities.School;



public class UserDAOmariatests {
	public static UserDAO udao = new UserDAOmaria();

	@Test
	public void getUserById() {
		User leroy = udao.getUserById(1);
		System.out.println(leroy);
	}
	
//	@Test
//	public void deleteUser() {
//		User user = udao.getUserById(1);
//		udao.deleteUser(user);
//		
//	}

}
