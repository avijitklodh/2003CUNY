package dev.jian.beans;


// POJO Plain Old Java Object
// Literally everything that is not a bean
// A bean is a class with private fields
// public  getters and setters and a no args constructor

// Java Bean
public class Student {

	private String name;
	private int id;
	private String major;
	
	public Student() {

	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
