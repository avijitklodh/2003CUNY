package dev.jian.zoo;

public class Horse extends Animal implements Herbivore, Petable{

	public Horse(int age) {
		super("Horse", age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Neigh whiney");
	}
	
	
	public void eatPlant() {
		System.out.println("eats hay");
	}
}
