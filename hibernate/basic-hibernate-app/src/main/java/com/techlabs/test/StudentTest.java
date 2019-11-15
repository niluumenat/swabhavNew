package com.techlabs.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.techlabs.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		retrieve();
		// create();
		//deleteById();
		updateById(2L);
		retrieve();

	}
	
	public static void updateById(Long id) {
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println(factory.getClass());

		Session session = null;
		Transaction txc = null;

		try {
			session = factory.openSession();
			txc = session.beginTransaction();
			
			Student stuObj = (Student) session.get(Student.class, id);
            stuObj.setName("Akashh");
            stuObj.setCgpa("9.9");
            
            txc.commit();
            System.out.println("Update done");
 
		} catch (Exception ex) {
			if (txc != null) {
				txc.rollback();
			}
			System.out.println(ex);

		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
	}

	private static void create() {
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println(factory.getClass());

		Session session = null;
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
			// session.save(s1);
			// session.save(s2);
			// session.save(s3);
			// txc.commit();
			System.out.println("Student data inserted....");

		} catch (Exception ex) {
			if (txc != null) {
				txc.rollback();
			}
			System.out.println(ex);

		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}

	}

	public static void retrieve() {
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println(factory.getClass());

		Session session = null;
		Transaction txc = null;

		try {
			session = factory.openSession();
			txc = session.beginTransaction();

			Query queryResult = (Query) session.createQuery("from Student");
			java.util.List allStudents;
			allStudents = ((org.hibernate.Query) queryResult).list();
			for (int i = 0; i < allStudents.size(); i++) {
				Student students = (Student) allStudents.get(i);
				System.out.println(students.getName() + " " + students.getCgpa());
			}
			txc.commit();
			System.out.println("Database contents delivered...");

		} catch (Exception ex) {
			if (txc != null) {
				txc.rollback();
			}
			System.out.println(ex);

		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
	}

	public static void deleteById() {
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println(factory.getClass());

		Session session = null;
		Transaction txc = null;

		try {
			session = factory.openSession();
			txc = session.beginTransaction();

			Student student1 = (Student) session.get(Student.class, 15L);
			if (student1 != null) {
				session.delete(student1);
				System.out.println("Student 1 is deleted");
			}
			txc.commit();

		} catch (Exception ex) {
			if (txc != null) {
				txc.rollback();
			}
			System.out.println(ex);

		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
	}
}
