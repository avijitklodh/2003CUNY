package b;

import a.Shape;

public class Rectangle extends Shape{
	
	public void showMethods() {
		this.pubMethod();
		this.proMethod();
		
//		this.privMethod();		not the same class
//		this.defMethod();	not the same package
	}

}
