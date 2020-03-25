package dev.jian.building;

public class House extends Dwelling{

	int walls;
	
	// java will call a default super()
	House(String owner){
		super(owner);	// calls the parent constructor
		// super must be the very first thing called in a constructor
		System.out.println("Building a default house with 4 walls");
		this.walls = 4;
	}
	
	House(){
		this("Default"); //calls the one argument house constructor House(String owner)
		System.out.println("Build a default house");
	}
	
	House(String owner, int area, int walls){
		super(owner, area);
		this.walls = walls;
		System.out.println("Build you a house with all your specification");
	}
	
}
