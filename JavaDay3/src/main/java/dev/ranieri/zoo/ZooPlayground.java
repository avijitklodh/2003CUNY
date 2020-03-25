package dev.ranieri.zoo;

public class ZooPlayground {
	
	public static void main(String[] args) {
		// 1st line of executed code starts here
		// Inheritance
		// Overriding
		
		//Animal cat = new Animal("Cat",3);	// animal is abstract and I cannot directly make animals anymore
		
		// cats are animals therefore this is an appropriate label
		// you will never make that cat object not a cat
		// You can only change what you label
		
		// dynamic polymophism is overriding
		// when you call makeSound on the garfield object 
		// Java does not know what method will actually call until you reach the object
		Animal garfield = new Cat(10); // Animal is still a valid identifier
		garfield.makeSound();
		((Cat) garfield).scratch();
		
		Animal clifford = new Dog(7);
		clifford.makeSound();
//		clifford.dig();// not all animals can dig Java will not allow me to call that method
		
		GoldenRetriever airbud = new GoldenRetriever(4);
		airbud.makeSound();
//		airbud.dig();
//		airbud.playBasketball();
		
		Animal steve = new Human(30);
		//steve.think();
		steve.makeSound();
		
		
		//label the object via an interface
		Horse seabiscuit = new Horse(3);
		seabiscuit.eatPlant();	
		Herbivore sea2 = seabiscuit;
		Animal a = seabiscuit;
		
		System.out.println(steve instanceof Petable);
		
	}

}
