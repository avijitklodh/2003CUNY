package dev.patel.overloading;

public class Person {
	
	String name;
	String occupation;
	
	static int amount =0;
	
	//constructors do not have return type
	//only methods in Java that you do not specify in return type
	public Person(String name, String occupation) {
		this.name = name;
		this.occupation = occupation;
		amount++;
	}


	Person (String name){
		this.name = name;
		this.occupation = "unspecified";
		amount++;
	}
	
	Person() {
		System.out.println("Made a person with no arguments");
		amount++;
	}
	
	
	
	//All constructors must be named same as the class
	//Default constructor if no constructor is specified
	

}
