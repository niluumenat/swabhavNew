package com.techlabs.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
	private static StudentService instance;
	List<Student> students;
	Student s1 = new Student("Nilam", "7.5");
	Student s2 = new Student("Floyd", "7");
	Student s3 = new Student("Akash", " 8");
	Student s4 = new Student("Sunny", " 6.7");
	Student s5 = new Student("Ravi", "7.8");

	public static StudentService getInstance() {
		if (instance == null) {
			instance = new StudentService();
		}
		return instance;
	}

	private StudentService() {
		System.out.println("Service created");
		students = new ArrayList<Student>();
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
	
	public Student getById(int id){
		Student student = null;
		for(Student s:students ){
			if(s.getId() ==id){
				student= s;
			}
		}
		System.out.println(student.getId());
		return student;
		
	}
	
	public void edit(int id,Student student){
		for(Student s:students ){
			if(s.getId() ==id){
				s.setName(student.getName());
				s.setCgpa(student.getCgpa());
			}
		}
		
		System.out.println(students);	
	}
	
	public void delete(int id){
		for(Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
		    if(iterator.next().getId() == id)
		        iterator.remove();
		}
		
		System.out.println(students);
		
	}
	
	
	

}
