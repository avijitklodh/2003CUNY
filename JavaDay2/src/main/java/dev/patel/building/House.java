package dev.patel.building;

public class House extends Dwelling{

	int walls;
	
	
	//
	House(String owner){
		super(owner); // calls parent constructor
		//super() mst be the first thing called
		System.out.println("Building a default house with w walls ");
		this.walls=4;
	}
	
	House(String owner, int area, int walls){
		super(owner, area);
		this.walls = walls;
		System.out.println("Build you a house with all your specification");
	}
	
	House(){
		this("Default"); // calls the one argument house constructor house(String house)
		System.out.println("Built a deafult house");
	}
}
