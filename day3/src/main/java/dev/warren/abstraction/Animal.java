package dev.warren.abstraction;

public abstract class Animal {
	
	String species;
	int age;
	
	
	
	public Animal(String species, int age) {
		this.species = species;
		this.age = age;
		
	}



	public void makeSound() {
		System.out.println("I'm making a sound!");
	}

}
