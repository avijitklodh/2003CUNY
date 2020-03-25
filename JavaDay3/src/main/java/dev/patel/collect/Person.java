package dev.patel.collect;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	int height;
	
	public Person(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	//it this object is less than the object you compare it to return -1
	//if this object is greater than the object you compare it to return 1
	//if the objects are same return zero
	public int compareTo(Person p) {
		if(this.age < p.age) {
			return -1;
		}
		if(this.age > p.age)
			return 1;
		
		return 0;
	}

	

}
