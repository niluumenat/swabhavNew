package com.techlabs.model;

public class Student {
	private String name;
	private String age;
	private String cgpa;
	public Student(String name, String age, String cgpa) {
		super();
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getCgpa() {
		return cgpa;
	}

}
