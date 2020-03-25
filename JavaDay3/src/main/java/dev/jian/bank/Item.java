package dev.jian.bank;

public class Item {
	String name;
	int price;
	
	Item(String name, int price){
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
}
