package dev.ranieri.objects;

public class ObjectPlayground {

	public static void main(String[] args) {
		
		System.out.println("Start of program");
		Box.describeBox();
		// new keyword means you are creating a brand new object in memory for Java
		Box a = new Box();
		Box b = new Box();
		a.value = 100;
		b.value = 200;
		
		System.out.println(a.value);
		System.out.println(b.value);
	
		// it is bad practice to access a class variable via an object
		a.sharedValue = 1000; // a.sharedValue is the same exact variable as b.sharedValue
		System.out.println(b.sharedValue);
		
		System.out.println(Box.sharedValue);
		
		a.showContents();
		b.showContents();
		
		System.out.println(Box.amount);
		
		
		// should it be static?
		// 1. is this value supposed to be shared by every instance of the class?
		// 2. Would this variable or method makes sense if there were 0 instances of this class?
		
		
		
	}

}
