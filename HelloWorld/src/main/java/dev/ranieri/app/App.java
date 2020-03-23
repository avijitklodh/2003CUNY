package dev.ranieri.app;

// All classes in Java Start with a Capital Letter
// ex Employee Associate SalesEmployee 
public class App {
	
	// Every Java application calls the main method to start
	// You cannot run a Java Application without a main method
	// ALWAYS public static void main String []
	public static void main(String [] args) {
		
		// naming conventions for variables
		// Variables should start lowercase
		
		int num = 0;
		String fname = "Adam";
		
		// do not use the following in Java		
		int cost$ = 90;
		
		// Snake case is avoided in Java
		String last_name = "Ranieri";
		
		String firstName = "Adam";
		
		System.out.println("Hello World");	
	}
	
	// Camel casing
	// first letter is lowercase followings words get a capitalized intial letter
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void sayHelloToEveryone() {
		System.out.println("Hello Everyone");
	}
	

}
