package dev.ranieri.zoo;

public class Dog extends Animal implements Omnivore, Petable{
	
	int age = 10000;
	
	public Dog(int age) {
		super("Dog",age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Bark Bark Woof");
	}
	
	public void dig() {
		System.out.println("Dog digs a hole in the ground");
	}

	public void eatMeat() {
		// TODO Auto-generated method stub
		
	}

	public void eatPlant() {
		// TODO Auto-generated method stub
		
	}
	
	public void fetchThing(Fetchable thing) {
		System.out.println("The dog grabed a " + thing);
	}
	
	
}
