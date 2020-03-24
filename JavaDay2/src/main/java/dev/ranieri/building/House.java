package dev.ranieri.building;

public class House extends Dwelling{
	
	int walls;
	
	// Java will call a default super()
	House(String owner){
		super(owner); // calls the parent constuctor
		// super must be the very first thing called in a constructor
		System.out.println("Building a default house with 4 walls");
		this.walls = 4;
	}
	
	
	House(String owner, int area, int walls){
		super(owner,area);
		this.walls = walls;
		System.out.println("Built you a house with all your specifications");
		
	}
	
	House(){
		this("Default"); // calls the one argument house constructor House(String Owner)
		System.out.println("Built a default house");
	}

}
