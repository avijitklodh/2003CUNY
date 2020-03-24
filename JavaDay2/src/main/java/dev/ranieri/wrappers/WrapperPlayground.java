package dev.ranieri.wrappers;

public class WrapperPlayground {

	public static void main(String[] args) {
		
		// Wrappers are the object version of primitives
		
		int x = 1000;
		Integer wx = 1000;
		
		// Wrappers classes have a lot of helpful methods
		
		int num = Integer.parseInt("40");
		System.out.println(Integer.MAX_VALUE);
		
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
		System.out.println(ii);
		
		long start = System.nanoTime();
		int n = 0;
		for(int i = 0; i <1000; i++) {			
			n = n +1;
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		
	}
	
	public static void unbox(int num ) {
		System.out.println(num);
	}
	
	public static void autobox(Integer num) {
		System.out.println(num);
	}
	
	public static Integer add100(Integer num) {
		return num +100;
	}
	
}
