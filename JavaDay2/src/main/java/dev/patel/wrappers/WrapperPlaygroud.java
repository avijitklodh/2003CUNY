package dev.patel.wrappers;

public class WrapperPlaygroud {
	
	public static void main(String[] args) {
		
		//wrappers are objects version of primitives
		
		int x = 1000;
		Integer wx = 1000;
		
		//wrappers classes have a lot of helpful methods
		
		int num = Integer.parseInt("40");
		System.out.println(Integer.MAX_VALUE);
		
		//int Integer
		//double Double
		// char Character
		//float Float
		//long Long
		//short Short
		//byte Byte
		//boolean Boolean
		
		
		//you pass a wrapper to a method that takes a primitive
		unbox(wx);
		
		//You pass a primitive to a method that takes in wrapper
		autobox(x);
	}

	
	public static void unbox(int num) {
		System.out.println(num);
	}
	
	public static void autobox(Integer num) {
		System.out.println(num);
	}
}
