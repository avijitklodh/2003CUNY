package dev.ranieri.threading;

public class ThreadPlayground {
	
	public static int num = 1000; // a resource (anything that a thread can use. Generally something
	// something that is shared)
	
	public static void main(String[] args) {
		// A thread is a path of execution through a program
		// Ability to run a process in parallel
		// Java is a multi-threaded language
		// you can have two chunks of code run simultaneously
		// sometimes this can boost optimitization
		
		// multi threading adds redundancy and fail safe
		// if one thread crashes the others can remain unaffected
		Runnable run1 = () ->{
			num = num +100;
			System.out.println("Hello World");
			System.out.println("Value at end of run1 " + num);
			};
			
		Runnable run2 = () ->{
			num = num*0; 
			System.out.println("Hola Mundo");
			System.out.println("Value at end of run2 " + num);
			};
		
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		
		t1.start();
		t2.start();
		
		
	}

}
