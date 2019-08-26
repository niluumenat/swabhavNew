package com.techlabs.map.collections;

public class Student {
	private int rollNo;
	private int standard;
	private String name;
	private float cgpa;
	public Student(int rollNo, int standard, String name, float cgpa) {
		super();
		this.rollNo = rollNo;
		this.standard = standard;
		this.name = name;
		this.cgpa = cgpa;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getStandard() {
		return standard;
	}
	public String getName() {
		return name;
	}
	public float getCgpa() {
		return cgpa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		result = prime * result + standard;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}
	
	
	
	
	

}
