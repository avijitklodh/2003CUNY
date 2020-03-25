package dev.patel.Zoo;

public class ZooPlayground {
	
	public static void main(String[] args) {
		
		//Inheritance
		//Overloading
		
		//Animal cat = new Animal("Cat", 3);
		
		//cats are animals therefore this is an appropriate label
		//You will never make that cat object not a cat
		//yoiu can only change what you label it
		
		//dynamic polymorphism is overriding
		//When you call make sound on the garfield object 
		//Java does not know what method will actually call unitill you reach an object
		Cat garfield = new Cat(10);
		garfield.makeSound();
		garfield.scratch();
		
		Dog clifford = new Dog(7);
		
		clifford.makeSound();
		
		//clifford.dig(); not all animals can dig Java will not allow me to call that method
		
		GoldenRetriever airbud = new GoldenRetriever(4);
		airbud.makeSound();
		airbud.playBasketball();
		
		Human steve = new Human(30);
		steve.think();
		steve.makeSound();
		
		//label the object via interface
		Horse seabiscuit = new Horse(3);
		seabiscuit.eatPlat();
		
		Herbivore sea2 = seabiscuit;
		
		System.out.println(seabiscuit instanceof Petable);
	}

}
