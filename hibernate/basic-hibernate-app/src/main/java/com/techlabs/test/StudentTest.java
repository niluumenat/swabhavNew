package com.techlabs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Student;

public class StudentTest {

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
			Student s1 = new Student();
			
			s1.setName("Nilam");
			s1.setCgpa("7.5");
			
			Student s2 = new Student();
			
			s2.setName("Heta");
			s2.setCgpa("6.5");
			
			Student s3 = new Student();
			
			s3.setName("Madhavi");
			s3.setCgpa("8");
			session.save(s1);
			session.save(s2);
			session.save(s3);
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
