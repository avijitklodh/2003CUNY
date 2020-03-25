package dev.jian.building;

public class ObjectPlayground {

	public static void main(String[] args) {
		
		// Object class is the class that everything in Java inherits from
		// Everything is of type Object
		
		Object e = new Estate("Adam", 1000, 30, 9000);

		
		// helpful object methods to know
		
		// toString gives you a string representation of an object
		// if you do not override toString it prints out the memory address
		
		// any print statement automatically call toString on an object
		System.out.println(e);	// e and e.toString are the same here
		
		// equals
		
		
		// == vs .equals
		// for objects == only checks to see if it is the same memory location (the same object)
		// .equals is a custom method that you will override to compare objects
		
		Dwelling d1 = new Dwelling("Sam", 1000);
		Dwelling d2 = new Dwelling("Frodo", 1000);
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
	}

}
