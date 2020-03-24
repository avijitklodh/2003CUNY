package dev.ranieri.building;

public class Estate extends House {

	int lawnSize;
	
	Estate(String owner, int area, int walls, int lawnSize){
		super(owner,area,walls);
		this.lawnSize = lawnSize;	
	}
	
	public void boastAboutEstate() {
		System.out.println("I have a mansion!!!!");
	}
	
	@Override
	public String toString() {
		return "This is the estate of " +this.owner;
	}
}
