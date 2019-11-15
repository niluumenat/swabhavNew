package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class StudentAction implements Action {
	@Autowired
	StudentService service;

	@Override
	public String execute() throws Exception {
		System.out.println("Inside studentaction execute...");
		List<Student> students = service.getStudents();
		System.out.println(service.getStudents().size());
		for(Student s1 : students) {
			System.out.println(s1.getId() +" "+ s1.getName() +" "+ s1.getCgpa());
		}
		return "success";
	}

}
