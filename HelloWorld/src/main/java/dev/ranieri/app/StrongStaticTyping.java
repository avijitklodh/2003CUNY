package dev.ranieri.app;

public class StrongStaticTyping {
	
	
	// Statically typed means that all variables you create must be given a type
	// All methods must have their return type delcared
	int x = 100;
	
	public int getNumber() {		
		int x = 10;
		return x;
	}

	// Strongly typed means variables cannot be coerced into other types
	public void method1() {
		
		String name = "Adam";
		int num = 100;
		
		//System.out.println(name-num);
	}
	
	

}
