package dev.jian.exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginPlayground {
	
	// only ever want one scanner in your application
	static Scanner scan = new Scanner(System.in);
	static Map<String, User> users = new HashMap<String, User>();

	public static void main(String [] args) {
		
		System.out.println("Enter your username");
		String username = scan.next();
		System.out.println("Enter your password");
		String password = scan.next();

		
		// you can have as many as catch blocks to your try as you want
		// However they must be ordered from most specific to least Specific
		// only one catch block ever executes
		try{
			createUser(username, password);
		}catch (InvalidUsernameException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(users);
		
		
	}
	
	
	// throws keyword is a warming to whoever call this method that an exception might be generated
	// whoever calls that method must either handle it or also use throws
	public static User createUser(String username, String password) throws InvalidUsernameException{
		if(username.length() < 8)
			throw new InvalidUsernameException("User name must be at least 8 characters long");	// every thing that inherits from exception must be handled before it will compile 
		
		if(password.contains("$"))
			throw new InvalidPasswordException();	// Runtime Exceptions do not need to handle
		
		User u = new User(username, password);
		users.put(username, u);		
		return u;
	}
	
}
