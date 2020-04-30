package dev.wael.beans;

public class Box {

	private int val;
	public Box(int val) {
		super();
		this.val = val;
	}

	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Box() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Box [val=" + val + "]";
	}
}
