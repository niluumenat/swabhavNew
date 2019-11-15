package com.techlabs.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Department;
import com.techlabs.entity.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
		System.out.println(factory.getClass());
		
		Session session =null;
		Transaction txc = null;
		
		try {
			session = factory.openSession();
			txc = session.beginTransaction();
			
			Department dept1 = new Department();
			dept1.setName("Sales");
			dept1.setLocation("NewYork");
			
			Employee emp1 = new Employee();
			emp1.setEmpName("Nilam");
			emp1.setSalary(100000);
			emp1.setDept(dept1);
			
			Employee emp2 = new Employee();
			emp2.setEmpName("Lisha");
			emp2.setSalary(150000);
			emp2.setDept(dept1);
			
			Set<Employee> employees= dept1.getEmployees();
			employees.add(emp1);
			employees.add(emp2);
			
			dept1.setEmployees(employees);
			
			session.save(dept1);
			
			txc.commit();
			System.out.println("Student data inserted....");
			
		}catch(Exception ex) {
			if(txc !=null) {
				txc.rollback();
			}
			System.out.println(ex);
			
		}finally {
			if(session.isOpen() ) {
				session.close();
			}
		}
	}


}
