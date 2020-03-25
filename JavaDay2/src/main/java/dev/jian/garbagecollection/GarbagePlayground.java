package dev.jian.garbagecollection;

public class GarbagePlayground {

	public static void main(String [] args) {
		
		// Garbage collection is the process by which objects in memory
		// are removed
		
		// Object are "eligible" to be garbage collected when there is no longer any reference to the object
		// No way to be reached within the program
		
		Book illiad = new Book("The Illiad", 200);
		
		Book b2 = illiad;
		
		illiad.describeSelf();
		
		// in Java you cannot destroy an object
		// the most you can do is remove any reference to that object
		// Then hope Java decides to garbage collect it
		illiad = null;
		
		// DO NOT USE
		// Ask politely for Java to do garbage collection
		// Java can decide not to anyway
		System.gc();
		
		method1();
		System.gc();
		
	}
	
	public static void method1() {
		
		// passes out of scope once the method is finished
		Book b = new Book("Wuthering Heights", 2000);
	}
	
}
