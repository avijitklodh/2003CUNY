package dev.calapatia.services;

import dev.calapatia.entities.User;

//service responsible logging in users
//logging out users
//creating users
//deleting users?
public interface AuthenticationService {

	User createUser(User user);
//	User login(User user);
	//User logout(User user);
}
