package dev.patel.Zoo;

//Putting extends inherits from a class. Creates an IS-A relationship between two classes
//a cat is an animal
public class Cat extends Animal implements Carnivore, Herbivore, Petable, Fetchable{
	
	
	//cat does have a species and age variable
	//we just dont see it because it was defined in the parent class
	public Cat( int age) {
		super("Cat", age);
	}
	
	@Override //just to make sure you are indeed overriding something
	public void makeSound() {
		System.out.println("The cat goes meow");
	}
	
	public void scratch() {
		System.out.println("Cat scratches up everything in your home");
	}

	public void eatPlat() {
		System.out.println("Eats cat nip");
		
	}

	public void eatMeat() {
		System.out.println("Eats fish out of a can");
		
	}

}
