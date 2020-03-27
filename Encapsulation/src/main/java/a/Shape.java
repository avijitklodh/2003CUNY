package a;

public class Shape {
	
	// access and scope are NOT THE SAME
	// Scope says where something lives like attached to an object
	// access says where you can actually call on that method/variable
	
	
	
	// most accessible
	public void pubMethod() {	// Accessible anywhere in the application
		System.out.println("Hi I'm the public method");
	}
	
	void defMethod() {	// default accessible anywhere in the same package
		System.out.println("Hi I'm the default method");
	}
	
	protected void proMethod() {	// default + children in another package can still access this method
		System.out.println("Hi I'm the protected method");
	}
	
	private void privMethod() {	// private is only the same class
		System.out.println("Hi I'm the private method");
	}
	
	// least accessible

}
