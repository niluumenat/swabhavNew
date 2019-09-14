package com.techlabs.composite.patterns;

public class Developer implements IEmployee {
	private String name;
	private long empId;
	private String position;

	public Developer(long empId, String name, String position) 
	    { 
	        this.empId = empId; 
	        this.name = name; 
	        this.position = position;
	    }

	@Override
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println(name+ " "+ empId+" "+position);
	}

	

}
