package dev.jian.building;

public class Dwelling {
	
	String owner;
	int area;
	
	
	public Dwelling(String owner, int area) {
		System.out.println("Creating a dwelling with area of " + area + " with owner " + owner);
		this.owner = owner;
		this.area = area;
	}
	
	public Dwelling(String owner) {
		System.out.println("Creating a dwelling with default area of 100 " + " with owner " + owner);
		this.area = 100;
		this.owner = owner;
	}
	
	public Dwelling() {
		
	}
	
	@Override	// throws a compiler error if you are not actually overriding something
	public boolean equals(Object o) {
		
		if(this.area == ((Dwelling)o).area) {
			return true;
		}
		return false;
	}
	
}
