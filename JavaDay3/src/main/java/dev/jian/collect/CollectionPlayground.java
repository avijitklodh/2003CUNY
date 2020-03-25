package dev.jian.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionPlayground {

	public static void main(String[] args) {
		
		Person adam = new Person("Adam", 19, 70);
		Person jaxon = new Person("Jaxon", 22, 72);
		Person alex = new Person("Alex", 23, 78);
		Person ian = new Person("Ian", 25, 65);
		
		// List is an interface, where ArrayList is an implementation of a List
		// <Type> generics allow you to specifiy what belongs to a collection
		List<Person> people = new ArrayList<Person>();
		
		people.add(adam);
		people.add(jaxon);
		people.add(alex);
		people.add(ian);
		
//		for(int i = 0; i < people.size(); i++) {
//			System.out.println(people.get(i));
//		}
		
//		// enhanced for loop
//		for(Person p : people) {
//			System.out.println(p);
//		}

		
		// HashSets will be ordered by hashcode
		// they will be faster to work with in terms of retreval add adding itmes
		
		// TreeSets are ordered
		// however that requires extra calculation and time
		Set<Person> peopleSet = new TreeSet<Person>();
		
		peopleSet.add(ian);
		peopleSet.add(adam);
		peopleSet.add(jaxon);
		peopleSet.add(ian);
		
		System.out.println(peopleSet);
		
		
		// maps are key value pairs. You cannot iterate over them
		// you put in a key and you get the value
		Map<String,Person> dictionary = new HashMap<String,Person>();
		
		dictionary.put("Rayman", adam);
		dictionary.put("Mountaineer", jaxon);
		dictionary.put("Al", alex);
		
//		Person p = dictionary.get("Al");
//		System.out.println(p);
		
		Set<String> strings = new TreeSet<String>();
		strings.add("phone");
		strings.add("table");
		strings.add("drinks");
		strings.add("fan");
		
		System.out.println(strings);
		
	}

}
