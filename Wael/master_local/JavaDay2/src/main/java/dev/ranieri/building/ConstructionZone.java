package dev.ranieri.building;

public class ConstructionZone {

	public static void main(String[] args) {
		
		// Inheritance is the process by which one class derives fields and methods from a parent class
		// Java only allows you to inherit from a single class
		// Classes can inherit in chains
		// a -> b -> c -> d
		// dwelling -> house
	//	Dwelling hobbithole = new Dwelling("Frodo", 200);
		
		House h = new House("Adam");
		
		Dwelling d = new Estate("Adam", 1000,20,5000);
		
		// DRY Do not repeat yourself
		// FourFunctionCalculator -> ScientificCalculator inherit the methods add subtract without having
		// having to type code
		
		// OOP models the real world very well
		// Employee -> Salseman
		// Employee -> Programmer
		// Employee -> Manager
	
		//System.out.println(d.getClass().getSuperclass().getSuperclass().getSuperclass().getSuperclass());
	
	}
	

}
