package dev.jian.app;


// All classes in Java Start with a Capital Letter
// ex Employee Associate SalesEmployee
public class App {

	// Every Java application calls the main method to start
	// You cannot run a Java Application without a main method
	// It's ALWAYS public static void main String []
	public static void main(String [] args) {
		
		// naming conventions for variables
		// Variables should start lower case
		
		int num = 0;
		String fname = "Jian";	// Suggest: keep everything lower case in variables name
		
		
		// do not use the following in Java
		int $ =90;
		// Snake case is avoided in Java
		String last_name = "Qiu";
		String firstName = "Jian";	//Could do this
		
		
		System.out.println("Hello World");
		
	}
	
	
	// Camel casing
	// first letter is lower case following words get a capitalized initial letter
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void sayHelloToEveryone() {
		System.out.println("Hello Everyone");
	}
	
	
}
