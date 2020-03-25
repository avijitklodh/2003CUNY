package dev.jian.zoo;

public class ZooPlayground {

	public static void main(String[] args) {
		
		// Inheritance
		// Overriding

//		Animal cat = new Animal("Cat", 3);	// Animal is abstract and I cannot directly make animals anymore
//		cat.makeSound();
		
		// Cats are animals therefore this is an appropriate label
		// you will never make that cat object not a cat
		// You can only change what you label
		
		// dynamic polymophism is overriding
		// when you call makeSound on the garfield object
		// Java does not know what method will actually call until you reach the object
		Animal garfield = new Cat(10);	// Animal is still a valid identifier
		
		System.out.println(garfield.species);
		garfield.makeSound();
		((Cat) garfield).scratch();
		
		
		Dog clifford = new Dog(7);
		clifford.dig();
		clifford.makeSound();
		
		
		Human me = new Human(99);
		me.think();
		me.makeSound();
		
		
		// label the object via an interface
//		Horse seabiscuit = new Horse(10);
		Horse seabiscuit = new Horse(10);
		seabiscuit.eatPlant();
		Herbivore sea2 = seabiscuit;
		sea2.eatPlant();
		
		System.out.println(seabiscuit instanceof Petable);
	}

}
