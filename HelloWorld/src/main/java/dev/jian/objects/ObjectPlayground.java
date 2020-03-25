package dev.jian.objects;

public class ObjectPlayground {

	public static void main(String [] args) {
		
		// new keyword means you are creating a brand new object in memory for Java
		Box a = new Box();
		Box b = new Box();
		
		a.value = 100;
		b.value = 200;
		
		System.out.println(a.value);
		
		// a.shareValue is the same exact variable as b.shareValue
		a.shareValue = 1000;	// bad practice to access a class variable via an object
		System.out.println(b.shareValue);
		// The right way to access static variable
		System.out.println(Box.shareValue);
		
		
		a.showContent();
		b.showContent();
		
		
		System.out.println(Box.amount);
		
		// should it be static?
		// 1. is this value supposed to be shared by every instance of the class?
		// 2. would this variable or method makes sense if there were 0 instances of this class?
		
		
	}
}
