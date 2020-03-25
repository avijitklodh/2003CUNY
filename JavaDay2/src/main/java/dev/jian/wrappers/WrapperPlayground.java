package dev.jian.wrappers;

public class WrapperPlayground {

	public static void main(String [] args) {
		
		// Wrapers are the object version of primitives
		
		int x = 100;
		Integer wx = 100;
		
		// Wrappers classes have a lot of helpful methods
		
		int num = Integer.parseInt("40");
		
		// int Integer
		// double Double
		// char Character
		// float Float
		// long Long
		// short Short
		// byte Byte
		// boolean Boolean
		
		// you pass a wrapper to a method that takes a primitive
		unbox(wx);
		
		// you pass a primitive to a method that takes in a wrapper
		autobox(x);
		
		Integer ii = 2000;
		add100(ii);
		System.out.println(ii); // STILL 2000, it only pass a copy
		
		
		long start = System.nanoTime();
		Integer n = 0;
		int m = 0;
		for(int i = 0; i < 100; i++) {
//			n = n + 1;
			m = m + 1;		// Much more faster using primitives instead of wrapper
		}
		long end = System.nanoTime();
		System.out.println(end - start);
		
		
		
	}
	
	public static void unbox(int num) {
		System.out.println(num);
	}
	
	public static void autobox(Integer num) {
		System.out.println(num);
	}
	
	public static void add100(Integer num) {
		num = num + 100;
	}
	
}
