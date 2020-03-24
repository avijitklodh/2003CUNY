package dev.ranieri.overloading;

public class Person {
	
	String name;
	String occupation;
	
	static int amount = 0;
	
	// All constructors must be named the same as the class
	// Constructors do not have a return type
	// only methods in Java that you do not specify a return type
	public Person(String name, String occupation){
		this.name = name;
		this.occupation = occupation;
		Person.amount +=1;
	}
		
	Person(String name){
		this.name = name;
		this.occupation = "unspecified";
		Person.amount +=1;
	}
	
	Person(){
		System.out.println("Made a person with no arguments");		
		Person.amount +=1;
	}

	// If you do not specify ANY CONSTRUCTORS Java will give you a default
	// no arguments constructor for a class
	
	// If you do not have a constructor one will be provided for you
}
