package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.StudentService;

public class StudentAction implements Action {
	@Autowired
	StudentService service;

	@Override
	public String execute() throws Exception {
		System.out.println("Inside studentaction execute...");
		System.out.println(service.getStudents().size());
		return "success";
	}

}
