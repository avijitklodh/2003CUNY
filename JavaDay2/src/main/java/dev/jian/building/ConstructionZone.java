package dev.jian.building;

public class ConstructionZone {

	public static void main(String [] args) {
		
		// Inheritance is the process by which one class derives fields and methods from a parent class
		// Java only allow you to inherit from a single class
		// Classes can inherit in chains
		// a -> b -> c -> d
		
//		Dwelling hobbithole = new Dwelling("Frodo", 200);
		
		House h = new House("Adam");
		
		Dwelling d = new House();	// A house d has a dwelling
		Dwelling d2 = new Estate("Adam", 1000, 20, 5000);
		
		// DRY Do Not Repeat Yourself
		// FourFunctionCalculator -> ScientificCalculator inherit the methods add subtract without having
		// to type code
		
		// OOP models the real world very well
		// Employee -> Salesman
		// Employee -> Programmer
		// Employee -> Manager
		
//		System.out.println(d2.getClass());
//		System.out.println(d2.getClass().getSuperclass());
	}
	
}
