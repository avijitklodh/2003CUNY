package dev.patel.building;

public class Dwelling {
	
	String owner;
	int area;
	public Dwelling(String owner, int area) {
		System.out.println("creating an owner is " + owner + "area is " + area);
		this.owner = owner;
		this.area = area;
	}
	
	public Dwelling(String owner) {
		System.out.println("creating defaut dwelling siz of 100 whose owner is " + owner );
		this.owner = owner;
		this.area = 100;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.area == ((Dwelling) o).area) {
			return true;
		}
		return false;
	}

}
