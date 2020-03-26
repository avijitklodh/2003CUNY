package dev.warren.creditcards;

public class Item {
	double price;
	String name;
	public Item(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Item [price= " + price + ", name= " + name + "]";
	}
	
	
}

