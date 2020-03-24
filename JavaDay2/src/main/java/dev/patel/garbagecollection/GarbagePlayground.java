package dev.patel.garbagecollection;

public class GarbagePlayground {
	
	public static void main (String [] args) {
		
		//Garbage Collection is the process by which objects in memory
		//are removed
		
		//Objects are eligible to be garbage collected when there is no longer an reference to the object
		//NO way to reached within the program
		
		Book illiad = new Book("The Illiad", 200);
		
		illiad.describeSelf();
		//in Java you cannot destroy an object
		//The most you can do is remove any reference to that object
		//Then hope Java decides to garbage collect it.
		illiad = null;
		Book b2 = illiad;
		System.out.println(b2);
		//do not use
		//Asks politely for java to do garbage collection
		System.gc();
		
	}

}
