package com.techlabs.college;

import java.util.ArrayList;
import java.util.List;

public class College {
	private int collegeId;
	private String collegeName;
	private List<Student> student;
	private List<Professor> professor;

	public College(int collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		student = new ArrayList<Student>();
		professor = new ArrayList<Professor>();
	}

	public List<Student> getStudents() {
		return student;
	}

	public List<Professor> getProfessors() {
		return professor;
	}

	public void addStudent(Student s) {
		student.add(s);
	}

	public void addProfessor(Professor p) {
		professor.add(p);
	}

	public int getCollegeId() {
		return collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}
}
