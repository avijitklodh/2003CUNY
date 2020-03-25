package dev.jian.zoo;

public class Human extends Animal implements Carnivore, Herbivore, Petable{

	public Human(int age) {
		super("Human", age);
	}
	
	public void think() {
		System.out.println("I think here I am");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Says hello");
	}
	
	public void eatMeat() {
		System.out.println("Eats a steak with a knife and fork");
	}
	

	public void eatPlant() {
		System.out.println("Eats a salad with a knife and fork");
	}
}
