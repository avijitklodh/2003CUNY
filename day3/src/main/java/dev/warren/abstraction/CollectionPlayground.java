package dev.warren.abstraction;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class CollectionPlayground {

	public static void main(String[] args) {
		Person a = new Person("Keisha", 32, 63);
		Person b = new Person("Jameka", 17, 54);
		Person c = new Person("Annatoliyah", 65, 62);
		
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(a);
//		personList.add(b);
//		personList.add(c);
		//System.out.println(personList);
		
//		for(Person p : personList) {
//			System.out.println(p);
//		}
		
		Set<Person> people = new TreeSet<Person>();
		people.add(a);
		people.add(b);
		people.add(c);
		
		for(Person p : people) {
		System.out.println(p);
	}
		
		
	}

}
