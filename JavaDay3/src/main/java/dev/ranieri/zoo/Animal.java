package dev.ranieri.zoo;

// An abstract class is one a class that you cannot directly instantiate
// That is the only restriction when you make an abstract
// Abstract class is still an is-a relationship
public abstract class Animal {

	public String species;
	public int age;
				
	public Animal(String species, int age) {
		super(); // super() is always the first line even if you do not put it
		// literally calls the Object constructor
		this.species = species;
		this.age = age;
	}

	// this is something that every animal can do
	
	// Because this class cannot be instantiated 
	// you can have abstract methods
	// methods which do not have an implementation
	
	// by making it abstract it FORCES you as the programmer to make a custom implementation
	// for every class that inherits from this abstract class
	public abstract void makeSound();
	
	// golden rule of Java. Java must ALWAYS have a valid method to call

}
