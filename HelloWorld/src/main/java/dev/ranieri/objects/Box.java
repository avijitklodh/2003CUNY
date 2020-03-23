package dev.ranieri.objects;

public class Box {
	
	// instance scope variable 
	// every box you create has it's own value variable
	int value;

	// class or static scope
	// this variable belongs to the class itself not to any instance of the class. no box in particular
	// there will only ever be one of this sharedValue variable
	static int sharedValue = 0;
	static int amount = 0;
	
	//constructors are special methods that allow you to create an instance of this class
	// constructors must be named the same as the class
	
	public Box(){
		System.out.println("Creating a box object");
		Box.amount = Box.amount +1;
	}
	
	public void showContents() {
		
		// this keyword refers to the individual instance of this class
		// the object itself
		
		// message is a locally scoped variable
		// it does not exist outside of the curly brackets it was declared in
		{
		String message = "The box has an internal value of ";	
		System.out.println(message + this.value);
		}
	}
	
	// num is method scope 
	// you can use num anywhere within this method
	public void addValue(int num) {
		
		this.value = this.value + num;
	}
	
	// static methods do not require an instance of that class to be called.
	// can be called directly through class
	
	public static void describeBox() {
		System.out.println("A box is something used to store things inside of");
	}
	

}
