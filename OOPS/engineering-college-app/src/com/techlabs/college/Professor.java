package com.techlabs.college;

public class Professor extends Person implements SalariedEmployee {
	public double basicSalary;
	public final double HRA=0.3*basicSalary;
	public final double TA=0.2*basicSalary;

	public Professor(String id, String address, String dob,double basicSalary) {
		super(id, address, dob);
		this.basicSalary=basicSalary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcCTC() {
		return (basicSalary+HRA+TA)*12;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getHRA() {
		return HRA;
	}

	public double getTA() {
		return TA;
	}
	
	
	


	
	

}
