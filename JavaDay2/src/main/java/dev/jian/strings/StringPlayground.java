package dev.jian.strings;

public class StringPlayground {

	public static void main(String [] args) {
		
		// Strings are one of the very few object able to be created without the new keyword
		
		String s1 = "Adam";
		String s2 = "Ranieri";
		
		// Strings have a String Pool
		// All strings with the same value are the same object
		
		String s3 = "Adam";
		// new guarantees you are creating a new object
		String s4 = new String("Adam");
		
		// String are objects therefore == compares the memory address not the value
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		
		// string are immutable. Once created they cannot be altered
		String s5 = s1 + "Ranieri";	// a brand new string was created
		System.out.println(s1);
		// Adam
		// Ranieri
		// Adam Ranieri
		System.out.println(s1.concat("Smith")); // will create a brand new Adam Smith
		
		// StringBuilder mutable version of string that you should use if
		// you need to perform String Manipulation operation
		
		StringBuilder sb1 = new StringBuilder("aaabbbccc");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		
		String s10 = "a";
		StringBuilder sb10 = new StringBuilder("a");
		
		long start = System.nanoTime();
		
		for(int i = 0; i < 1000; i++) {
//			s10 = s10 + "b";
			sb10.append("b");	// Much Faster
		}
		
//		System.out.println(s10);
		long end = System.nanoTime();
		
		System.out.println(end-start);
	}
	
}
