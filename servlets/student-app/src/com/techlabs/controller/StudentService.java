package com.techlabs.controller;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
	List<Student> students = new ArrayList<Student>();;

	Student s1 = new Student("Nilam", "7.5");
	Student s2 = new Student("Floyd", "7");
	Student s3 = new Student("Akash", " 8");
	Student s4 = new Student("Sunny", " 6.7");
	Student s5 = new Student("Ravi", "7.8");

	public StudentService() {
		System.out.println("Service created");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
	}

	public List<Student> get() {
		System.out.println(students.size());
		return students;
	}

	public void addStudents(Student stud) {
		students.add(stud);
		System.out.println(students.size());

	}

}
