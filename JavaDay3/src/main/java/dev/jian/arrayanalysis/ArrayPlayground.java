package dev.jian.arrayanalysis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayPlayground {

	public static void main(String[] args) {
		
		Generator<String> sgenerator = new Generator<String>();
		
		
		List<Object> things = ArrayFactory.getList(0);
		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			things.add(new Object());
		}
		end = System.nanoTime();
		System.out.println("Time to add 100, 000 object to list " + (end-start)/1000000);
		
		
		start = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			things.get(50000);
		}
		end = System.nanoTime();
		System.out.println("Time to get object from mid of list list 100,000 times" + (end-start)/1000000);
		
		
		start = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			things.add(5, new Object());
		}
		end = System.nanoTime();
		System.out.println("Time to add an object to beginning of list list 100,000 times" + (end-start)/1000000);
		
	}

}
