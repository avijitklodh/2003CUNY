package dev.ranieri.garbage;

public class GarbagePlayground {
	
	public static void main(String[] args) {
		
		// Garbage collection is the process by which objects in in Memory
		// are removed
		
		// Objects are *eligible* to be garbage collected when there is no longer any reference to the object
		// No way to be reached within the program
		
		Book illiad = new Book("The Illiad", 200);	
		
		illiad.describeSelf();
		
		// in Java you cannot destroy an object
		// the most you can do is remove any references to that object
		// Then hope Java decides to garbage collect it
		illiad = null;
		Book b2 = illiad;
		
		// DO NOT USE
		// Asks politely for Java to do garbage collection
		// Java can decide not to anyway
		
		
		method1();
		System.gc();
	}
	
	public static void method1() {
		
		// passes out of scope once the method is finished
		Book b = new Book("Wuthering Heights", 2000);
		
	}
	

}
