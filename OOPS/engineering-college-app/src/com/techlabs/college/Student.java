package com.techlabs.college;

public class Student extends Person {
	public Branch branch;

	public Student(String id, String address, String dob, Branch branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public Branch getBranch() {
		return branch;
	}
	
	
	
		
	

	

	

	
}
