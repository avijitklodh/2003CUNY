package dev.jian.app;

public class StrongStaticTyping {

	
	// Statically typed means that all variables you create must be given a type
	// Not allow like x = 100
	// All methods must have their return delcared
	int x = 100;
	
	
	// Strong typed means variables cannot be coerced into other types
	
	public void method1() {
		
		String name = "Jian";
		int num = 100;
		
		//System.out.println(name-num);
	}
	
	public int getNumber() {
		int x = 10;
		return x;
	}
	
	
}
