package com.techlabs.student;

import java.io.Serializable;

public class Student implements Serializable{
	private int age;
	private float cgpa;
	public Student(int age, float cgpa) {
		super();
		this.age = age;
		this.cgpa = cgpa;
	}
	public int getAge() {
		return age;
	}
	public float getCgpa() {
		return cgpa;
	}
	
	
	

}
