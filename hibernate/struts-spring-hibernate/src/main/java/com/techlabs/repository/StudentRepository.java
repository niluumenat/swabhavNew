package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;
@Repository("StudentDAO")
public class StudentRepository {
	@Autowired
	private SessionFactory factory;
	
	public StudentRepository() {
		super();
		System.out.println("Inside repository....");
	}

	public List<Student> get(){
		System.out.println("Hello from get method from repository...");
		Session session = factory.openSession();
		List<Student> students =  session.createCriteria(Student.class).list();
		
		return students;
	}

}
