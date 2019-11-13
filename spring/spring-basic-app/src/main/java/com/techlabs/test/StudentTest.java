package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.repository.StudentRepository;
import com.techlabs.service.StudentService;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentService service1 = (StudentService) context.getBean("StudentSvc", StudentService.class);
		System.out.println(service1.getStudents().size());

		StudentService service2 = (StudentService) context.getBean("StudentSvc");
		System.out.println(service2.getStudents().size());
		
		System.out.println(service1.hashCode()==service2.hashCode());
		System.out.println(service2.hashCode());
		
		StudentRepository repo = (StudentRepository) context.getBean("StudentDAO");
		System.out.println(repo.get().size()); 
	}

}
