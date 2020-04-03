package dev.calapatia.daotests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dev.calapatia.daos.SuperUserDAO;
import dev.calapatia.daos.SuperUserDAOmaria;

import dev.calapatia.entities.User;




public class SuperDAOmariatests {

	public static SuperUserDAO sudao = new SuperUserDAOmaria();

	@Test
	public void getUserById() {
		User leroy = sudao.getUserById(1);
		System.out.println(leroy);
	}
	
	@Test
	public void deleteUser() {
		User user = sudao.getUserById(1);
		sudao.deleteUser(user);	
	}
	
	@Test
	public void updateUser() {
		User felix = sudao.getUserById(1);
		felix.setUsername("Felix The Cat");
		sudao.updateUser(felix);
		System.out.println(felix);
		
	}
	
	@Test
	public void getAllUsers() {
		List<User> users = sudao.getAllUsers();
		System.out.println(users);
	}
	
	@Test
	public void getUserByName() {
		User tim = sudao.getUserByUserName("Tim Tebow");
		System.out.println(tim);
	}
	
	@Test
	public void createUser() {
		
		User enigma = new User();
		enigma.setUsername("Enigma");
		enigma.setPassword("Milk Carton");
		
		
		sudao.createUser(enigma);
		System.out.println(enigma);
		
	}

}
