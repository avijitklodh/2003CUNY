package dev.patel.Zoo;

public class Human extends Animal implements Herbivore, Carnivore{

	public Human( int age) {
		super("Human", age);
		
	}
	
	public void think() {
		System.out.println("I think therefire I am");
	}

	@Override
	public void makeSound() {
		System.out.println("says hello");
		
	}

	public void eatMeat() {

		System.out.println("Eats a steak with knife and fork");
	}

	public void eatPlat() {

		System.out.println("Eats a salad with knife and fork");
	}

}
