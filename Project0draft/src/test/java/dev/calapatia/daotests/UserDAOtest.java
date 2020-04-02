package dev.calapatia.daotests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dev.calapatia.daos.UserDAO;
import dev.calapatia.daos.UserDAOlocal;
import dev.calapatia.entities.User;



public class UserDAOtest {
	
	static UserDAO udao = new UserDAOlocal();
	
//	@Before
//	public void setup() {
//		User user = new User();
//		user.setUsername("Leroy Jenkins");
//		user.setPassword("LetMeIn123");
//		
//		user = udao.createUser(user);
//		
//		System.out.println(user);
//		
//		User user2 = new User();
//		user2.setUsername("Felix The Cat");
//		user2.setPassword("Password");
//		
//		user2 = udao.createUser(user2);
//		
//		System.out.println(user2);
//		
//		User user3 = new User();
//		user3.setUsername("Leroy Jenkins");
//		user3.setPassword("LetMeIn123");
//		user3.setUserId(101);
//		
//		user3 = udao.createUser(user3);
//		
//	}

//	@Test
//	public void createUserTest() {
//		User user = new User();
//		user.setUsername("Leroy Jenkins");
//		user.setPassword("LetMeIn123");
//		
//		user = udao.createUser(user);
//		
//		System.out.println(user);
//		
//		User user2 = new User();
//		user2.setUsername("Felix The Cat");
//		user2.setPassword("Password");
//		
//		user2 = udao.createUser(user2);
//		
//		System.out.println(user2);
//		
//		User user3 = new User();
//		user3.setUserId(101);
//		//user3 = udao.createUser(user3);
//		//System.out.println(user3.getUserId());
//		user3.setUsername("Leroy Jenkins");
//		user3.setPassword("LetMeIn123");
//		user3.setUserId(101);
//		
//		//user3 = udao.createUser(user3);
//		
//		System.out.println(user3);
//		
//	}
	
//	@Test
//	public void getAllUserTest() {
//		System.out.println(udao.getAllUsers());
//		
//	}
//	
//	@Test
//	public void getUserByNameTest() {
//		User coral = udao.getUserByName("Felix The Cat");
//		System.out.println(coral);
//	}
}
