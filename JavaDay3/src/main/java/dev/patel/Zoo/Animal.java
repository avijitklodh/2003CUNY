package dev.patel.Zoo;


//Abstract class cannot be directly instantiaited
//Abstract class is still an Is-A relationship
public abstract class Animal {
	
	public String species;
	public int age;
	
	
	
	
	public Animal(String species, int age) {
		super(); //super is always first line even if you do not put
		//literally calls an object constructor
		this.species = species;
		this.age = age;
	}




	//this is something every animal can do
	
	//becasue this class cannot be instantiated 
	//you can have abstract methods
	//methods which do not have an implementaion
	public abstract void makeSound();
	
	//golden rule of java. Java must always have a valid method to call

}
