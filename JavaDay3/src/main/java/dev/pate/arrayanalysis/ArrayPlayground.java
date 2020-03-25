package dev.pate.arrayanalysis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayPlayground {

	public static void main(String[] args) {
		
		Generator<String> sgenerator = new Generator<String>();
		
		List<Object> things = ArrayFactory.getList(10);		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i=0; i<100000; i++) {
			things.add(new Object ());
		}
		end = System.nanoTime();
		
		System.out.println("Time to add 100000 object to list " + (end - start)/1000000);
		
		
		//Time to retrive an object from middle of the list 
		start = System.nanoTime();
		for(int i=0; i<100000; i++) {
			things.get(50000);
		}
		end = System.nanoTime();
		
		System.out.println("Time to get object from middle of list 100000 " + (end-start)/1000000);
		
		
		
		//time to insert something a the beginning of the arraylist 
		start = System.nanoTime();
		for(int i=0; i<100000; i++) {
			things.add(0,new Object ());
		}
		end = System.nanoTime();
		
		System.out.println("Time to add an object to beginning 100000 " + (end-start)/1000000);
		
	}

}
