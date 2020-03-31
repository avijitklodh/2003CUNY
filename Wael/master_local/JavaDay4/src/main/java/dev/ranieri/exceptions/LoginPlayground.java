package dev.ranieri.exceptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginPlayground {

	
	// only ever want one scanner in your application
	static Scanner scan = new Scanner(System.in);
	static Map<String,User> users = new HashMap<String,User>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to create a user");
		
		System.out.println("Enter your username");
		String username = scan.next();
		
		System.out.println("Enter your password");
		String password = scan.next();
		
		// you can have as many catch blocks to your try as you want
		// However they must be ordered from most specific to least Specific
		// only one catch block ever executes
		try {
			createUser(username,password);
		} catch (InvalidUsernameException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {		
			System.out.println(e.getMessage());
		} 
		
		System.out.println(users);
		
	}
	
	// throws keyword is a warning to whoever call this method that an exception might be generated
	// whoever calls that method must either handle it or also use throws 
	public static User createUser(String username, String password) throws Exception {
			
		// every thing that inherits from exception must be handled before it will compile
		if(username.length()<8) 			
			throw new InvalidUsernameException("Username must be at least 8 characters long"); 
		
		if(!password.contains("$"))
			throw new InvalidPasswordException(); // Runtime Exceptions do not have to be handled
		
		if(false)
			throw new Exception("Most generic problem ever");
		
		System.out.println("Hello");
		
		User u = new User(username,password);
		users.put(username, u);		
		return u;	
		
	}

}
