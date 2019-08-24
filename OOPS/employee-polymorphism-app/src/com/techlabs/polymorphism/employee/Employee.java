package com.techlabs.polymorphism.employee;

public abstract class Employee {
	private int empNo;
	private String empName;
	protected double empBasicSalary;

	public Employee(int empNo, String empName, double empBasicSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empBasicSalary = empBasicSalary;
	}

	abstract public double calCTC();

	abstract public String salaryDetails();

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpBasicSalary() {
		return empBasicSalary;
	}

}
