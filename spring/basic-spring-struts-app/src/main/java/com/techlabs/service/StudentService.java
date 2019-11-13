package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;
@Service("StudentSvc")
public class StudentService {
	@Autowired
	StudentRepository repo ;
	
	
	public StudentService() {
		System.out.println("Inside service....");
	}


	public List<Student> getStudents(){
		return repo.get();
	}

}
