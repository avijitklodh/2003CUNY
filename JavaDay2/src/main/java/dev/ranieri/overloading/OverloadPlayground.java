package dev.ranieri.overloading;

public class OverloadPlayground {

	public static void main(String[] args) {
		
		// overloading is when two or more methods have the same name but different parameters		
		int result = sum(30,40);
		double result2 = sum("60","50");
		
		// overloading occurs only within the same class
		// static polymorphism is overloading
		
	}
	
	
	// the sum method is overloaded
	// same name different parameters
	public static int sum(int num1, int num2) {
		return num1 +num2;
	}
	
	public static Double sum(String num1, String num2) {
		
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		
		return (double) (a+b);	
	}
	
}
