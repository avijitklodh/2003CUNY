package dev.ranieri.primitives;

public class PrimitivePlayground {

	public static void main (String [] args) {
		
		//primitives in Java
		
		boolean bool = false; // N/A
		byte b = 0; // 1 byte
		char c = 'c'; // 2 bytes
		short s = 90; // 2 bytes
		int i = 300000000; // 4 bytes
		long l = 1000; // 8 bytes
		float f = 200.2f; // 8 bytes 
		double d = 300; // 16 bytes
		
		
		
		int num1 = 1000;
		int num2 = 2000;
		
		// double holds 16 bytes of information
		//double sum = num1 + num2;
		
		double num4 = 1000.1;
		double num5 = 2000.2;
		
		//int sum = num4 + num5;
		//System.out.println(Integer.MAX_VALUE);
		
		byte y1 = 10;
		byte y2 = 20;
		// any primitve less than a byte gets convereted into an int to perform math calculations
		// byte sum = y1 +y2;
		
		char c2 = 100 +2;
		
		int ii = Integer.MAX_VALUE +100;
		System.out.println(ii);
	}

}
