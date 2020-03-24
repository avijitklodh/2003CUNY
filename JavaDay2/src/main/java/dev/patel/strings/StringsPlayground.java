package dev.patel.strings;

public class StringsPlayground {
	
	public static void main (String [] args) {
		
		//Strings are one of the very few objects able to be created without the new keyword
		//Strings are object there fore == compares memory address not the value
		String s1 = "Nirav";
		String s2 = "Patel";
		String s3 = "Nirav";
		//New gurantees you are creating a new object
		String s4 = new String("Nirav");
		//Strigs have string pool
		//All strings with same value are same object
		
		System.out.println(s1 == s3);
		
		System.out.println(s1 == s4);
		
		System.out.println(s1.equals(s4));
		
		//string are immutable. once created they cannot be altered
		
		String s5 = s1 +"Patel"; // a brand new string is created
		
		System.out.println(s1);
		//.concat will create a brand new string
		
		//String builder mutable version of string that you should use if 
		//you need to perform String Manipulation operations
		
		
		//one string
		StringBuilder sb1 = new StringBuilder("aaaabbbbbccccc");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		String s10 = "a";
		
		StringBuilder sb10 = new StringBuilder("a");
		long start = System.nanoTime();
		
		for(int i = 0; i < 1000; i++) {
			//s10 = s10 + "b";
			sb10.append("b");
		}
		
		//System.out.println(sb10);
		long end = System.nanoTime();
		
		System.out.println(end-start);
		
	}

}





