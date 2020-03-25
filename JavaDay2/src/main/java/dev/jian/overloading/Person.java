package dev.jian.overloading;

public class Person {

	String name;
	String occupation;
	
	static int amount = 0;
	
	// All constructors must be named the same as the class
	// Constructors do not have a return type
	// only methods in Java that you do not specify a return type
	Person(String name, String occupation){
		this.name = name;
		this.occupation = occupation;
		Person.amount += 1;
	}
	
	Person(String name){
		this.name = name;
		Person.amount += 1;
	}
	
	Person(){
		System.out.println("Make a person with no arguement");
		Person.amount += 1;
	}
	
	// If you do not specify ANY CONSTRUCTIORS Java will give you a default
	// no argument constructor for a class
	
	// If you do not have a constructor one will be provided for you
	
}
