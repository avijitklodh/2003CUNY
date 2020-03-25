package dev.jian.zoo;

public class Dog extends Animal implements Omnivore, Petable{

	public Dog(int age) {
		super("Dog", age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Brak Brak Woof");
	}
	
	public void dig() {
		System.out.println("Dog digs a hole in the ground");
	}
	
	public void eatPlant() {
		
	}
	
	public void eatMeat() {
		
	}
	
	public void fetchThing(Fetchable thing) {
		System.out.println("A dog grab a " + thing);
	}
}
