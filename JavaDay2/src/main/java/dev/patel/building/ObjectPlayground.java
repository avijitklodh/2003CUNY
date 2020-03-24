package dev.patel.building;

import dev.patel.overloading.Person;

public class ObjectPlayground {

	public static void main(String[] args) {

		
		//Object class is the class that everythingin java ingerits from
		//Everything is type object
		
		Object e = new Estate("Adam", 1000, 30, 9000);
		Object p = new Person("Nirav", "Trainer");
		
		Object s = "sdfsffs";
		
		//helpful object methods to know
		
		// toString  - gives you a string representation of an Object
		//if you donot override to String it print out the emory address
		
		//any print statement calls atomatically toString on an object
		System.out.println(e.toString());
		
		//equals
		//== vs .equals for objects
		//for objects == only check to see if there memory location
		//.equals is a custom method that you will override to compare objects
		
		
		Dwelling d1 = new Dwelling("sam" , 1000);
		Dwelling d2 = new Dwelling("Frodo", 1000);
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		
		
	}

}
