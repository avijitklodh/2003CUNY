package dev.ranieri.building;

public class Dwelling {
	
	String owner;
	int area;
	
	
	public Dwelling(String owner, int area) {
		System.out.println("Creating a dwelling with area of " + area + " whose owner is" + owner );
		this.owner = owner;
		this.area = area;
	}
	
	public Dwelling(String owner) {
		System.out.println("Creating default dwellling size of 100 whose owner is" + owner );
		this.area = 100;
		this.owner = owner;
	}
	
	public Dwelling() {
		
	}
	
	@Override // throws a compiler error if you are not actullay overriding something
	public boolean equals(Object o) {
		
		if(this.area == ((Dwelling) o).area) {
			return true;
		}
		return false;
	}
	
}
