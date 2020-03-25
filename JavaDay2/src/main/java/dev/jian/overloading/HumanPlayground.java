package dev.jian.overloading;

public class HumanPlayground {

	public static void main(String [] args) {
		
		Person adam = new Person("Adam", "Trainer");
		Person ricky = new Person();	// it fails because we do not have a no arguement
		// constructor for the person class
		Person stevens = new Person("Stevens");
		
	}
	
	
}
