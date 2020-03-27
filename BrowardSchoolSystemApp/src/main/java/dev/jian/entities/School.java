package dev.jian.entities;

import java.util.ArrayList;
import java.util.List;

// entities store your data
// should be beans
public class School {

	// unique way to identify every school
	// Primary key
	private int schoolId;
	private String name;
	private int phone;
	private int capacity;
	
	private List<Student> students = new ArrayList<Student>();
	
	public School() {
	
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", name=" + name + ", phone=" + phone + ", capacity=" + capacity
				+ ", students=" + students + "]";
	}

	
	
	
	
	
}
