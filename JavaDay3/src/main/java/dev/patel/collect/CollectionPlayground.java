package dev.patel.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionPlayground {
	
	public static void main(String[] args) {
		
		Person nirav = new Person("Nirav", 23, 71);
		Person jaxon = new Person("Jaxon", 22, 72);
		Person alex = new Person("Alex", 23, 76);
		Person ian = new Person("Ian", 25, 65);
		
		//List is an Interface, ArrayList is an implementation of a List
		//<Type> generics allow you to specify what belongs in a collection
		List <Person> people = new ArrayList<Person>();
		
		people.add(nirav);
		people.add(jaxon);
		people.add(alex);
		people.add(ian);
		
//		System.out.println(people.toString());
//		
//		for(int i=0; i<people.size(); i++) {
//			System.out.println(people.get(i));
//		}
		
		
		//enhanced for loop
		//Cannot remove or add in enhanced for loop
//		for(Person p : people) {
//			System.out.println(p);
//		}
		
		
		//Hashsets will be ordered by hascode
		
		Set<Person> peopleSet = new HashSet<Person>();
		
		peopleSet.add(nirav);
		peopleSet.add(jaxon);
		peopleSet.add(alex);
		peopleSet.add(ian);
		
		//System.out.println(peopleSet);
//		for(Person p : peopleSet) {
//			System.out.println(p);
//		}
		
		
		
		//Maps are key value pairs. You cannot iterate over them.
		//you put in a key and you get out a value
		Map<String,Person> dictionary = new HashMap<String, Person>();
		
		dictionary.put("pate", nirav);
		dictionary.put("Mountaineer", jaxon);
		dictionary.put("Al", alex);
		
		Person p = dictionary.get("Al");
		//System.out.println(p);
		
		Set<String> strings = new TreeSet<String>();
		strings.add("phone");
		strings.add("table");
		strings.add("fan");
		
		
		
	}

}
