package dev.ranieri.entities;


public class Associate {
	
	private int aId;	
	private String name;
	private int points;

	public Associate() {
		super();
	}

	public Associate(int aId, String name, int points) {
		super();
		this.aId = aId;
		this.name = name;
		this.points = points;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Associate [aId=" + aId + ", name=" + name + ", points=" + points + "]";
	}


}
