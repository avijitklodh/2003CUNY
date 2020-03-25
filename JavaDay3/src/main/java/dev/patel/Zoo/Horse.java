package dev.patel.Zoo;

public class Horse extends Animal  implements Herbivore, Petable{

	public Horse( int age) {
		super("Horse", age);
		
	}

	@Override
	public void makeSound() {
		System.out.println("Neigh");
		
	}

	public void eatPlat() {

		System.out.println("Eats hay");
	}

}
