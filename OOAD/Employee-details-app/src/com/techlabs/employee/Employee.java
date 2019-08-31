package com.techlabs.employee;

public class Employee {
	private int empId;
	private String name;
	private String designation;
	private int managerId;
	private String doj;
	private int salary;
	private String commission;
	private int departmentNo;
	public Employee(int empId, String name, String designation, int managerId, String doj, int salary,
			String commission, int departmentNo) {
		super();
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.managerId = managerId;
		this.doj = doj;
		this.salary = salary;
		this.commission = commission;
		this.departmentNo = departmentNo;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public int getManagerId() {
		return managerId;
	}
	public String getDoj() {
		return doj;
	}
	public int getSalary() {
		return salary;
	}
	public String getCommission() {
		return commission;
	}
	public int getDepartmentNo() {
		return departmentNo;
	}
	
	
	

}
