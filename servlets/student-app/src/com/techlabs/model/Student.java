package com.techlabs.model;

public class Student {
	
	private static int id=100;
	private String name;
	private String cgpa;
	private int studentId=0;
	
	public Student(String name, String cgpa) {
		studentId = id++;
		this.name = name;
		this.cgpa = cgpa;
	}
	public int getId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	public String getCgpa() {
		return cgpa;
	}
	
	
	
	

}
