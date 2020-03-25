package dev.ranieri.crediassignment;

public class Item {
	
	String name;
	double price;
		
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
}
