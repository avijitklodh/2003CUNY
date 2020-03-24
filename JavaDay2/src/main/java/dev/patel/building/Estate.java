package dev.patel.building;

public class Estate extends House{
	
	int lawnsize;
	
	Estate(String owner, int area, int walls, int lawnsize){
		super(owner, area, walls);
		this.lawnsize = lawnsize;
	}
	
	public void bpastAboutEstate() {
		System.out.println("I have a mansion");
	}
	
	@Override
	public String toString() {
		return "thi is the owner of this house " + this.owner;
	}

}
