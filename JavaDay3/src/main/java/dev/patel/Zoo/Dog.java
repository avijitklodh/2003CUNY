package dev.patel.Zoo;

public class Dog extends Animal implements Omnivore, Petable{

	public Dog(int age) {

		super("Dog", age);
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

	public void eatPlat() {
		// TODO Auto-generated method stub
		
	}
	
	public void fetaching (Fetchable thing) {
		System.out.println("The grabbed a thing" + thing);
	}

}
