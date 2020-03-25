package dev.ranieri.collect;

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
		Person alex = new Person("Alex", 23,76);
		Person ian = new Person("Ian",25,65);
		
		System.out.println(ian.compareTo(alex));
		
		// List is an interface ArrayList is an implementation of a List
		// <Type> generics allow you to specify what belongs in a collection
		// You should always use generics
		List<Person> people = new ArrayList<Person>();
		
		people.add(jaxon);
		people.add(alex);
		people.add(jaxon);
		people.add(adam);
		people.add(jaxon);
		people.add(ian);
	
//		for(int i =0; i < people.size(); i++) {
//			people.remove(2);
//			System.out.println(people.get(i));
//		}
		
		// enhanced for loop
//		for(Person p : people) {
//			System.out.println(p);
//		}
//		
		// HashSets will be ordered by hashcode
		// they will be faster to work with in terms of retieval and adding items
		
		//TreeSets are ordered 
		// however that requires extra calcualtion and time
		Set<Person> peopleSet = new TreeSet<Person>();
		
		peopleSet.add(ian);
		peopleSet.add(adam);
		peopleSet.add(jaxon);
		peopleSet.add(ian);
		
		System.out.println(peopleSet);
		
		// maps are key value pairs. You cannot iterate over them
		// you put in a key and you get out a value
		
		// WVU West Virginia University
		// The Mountaineers
		Map<String,Person> dictionary = new HashMap<String,Person>();
		
		dictionary.put(adam.name, adam);
		dictionary.put("Mountaineer", jaxon);
		dictionary.put("Al", alex);
		dictionary.put("Rayman",ian);
		
		Person p = dictionary.get("Rayman");
//		System.out.println(p);
		
		Set<String> strings = new TreeSet<String>();
		strings.add("phone");
		strings.add("table");
		strings.add("fan");
		
//		System.out.println(strings);
		
	
		
	}

}
