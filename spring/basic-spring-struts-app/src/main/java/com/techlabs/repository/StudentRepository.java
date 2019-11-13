package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;
@Repository("StudentDAO")
public class StudentRepository {
	List<Student> students = new ArrayList<Student>();
	
	Student s1 = new Student("Nilam", "22", "7.5");
	Student s2 = new Student("Heta", "23", "6.5");
	Student s3 = new Student("Komal", "22", "7.8");
	
	
	public StudentRepository() {
		super();
		System.out.println("Inside repository....");
		students.add(s1);
		students.add(s2);
		students.add(s3);
	}


	public List<Student> get(){
		return students;
	}

}
