package com.techlabs.college.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.college.Branch;
import com.techlabs.college.College;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class CollegeTest {
	public static void main(String[] args) {
		/*
		 * System.out .println("id: " + student.getId() + " Address: " +
		 * student.getAddress() + "Branch: " + student.getBranch()); Professor
		 * professor = new Professor("104", "goregaon", "1/15", 1000);
		 * System.out.println("id: " + professor.getId() + " Address: " +
		 * professor.getAddress() + " Total salary:" + professor.calcCTC());
		 */
		Student s1 = new Student("101", "malad", "14/12/97", Branch.Civil);
		Student s2 = new Student("202", "goregaon", "12/5/97", Branch.Chemical);

		Professor p1 = new Professor("104", "mulund", "1/8/87", 1000);

		College college = new College(532, "Atharva");

		college.addStudent(s1);
		college.addStudent(s2);
		college.addProfessor(p1);

		List<Student> alist = college.getStudents();
		List<Professor> plist = college.getProfessors();

		System.out.println("College Details: ");
		System.out.println(" Id: " + college.getCollegeId() + " Name: " + college.getCollegeName());

		System.out.println("Details of Students: ");
		for (Student s : alist) {
			System.out.println(" ID " + s.getId() + " Address: " + s.getAddress() + " DOB: " + s.getDob() + " Branch: "
					+ s.getBranch());
		}
		System.out.println("Details of Professors: ");
		for (Professor p : plist) {
			System.out.println(" ID: " + p.getId() + " Address: " + p.getAddress() + " DOB: " + p.getDob() + " CTC: "
					+ p.calcCTC());

		}
		// System.out.println(college.getStudents());
		// college.getProfessors();

	}

}