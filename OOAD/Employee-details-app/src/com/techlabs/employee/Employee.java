package com.techlabs.employee;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	private int empId;
	private String name;
	private String designation;
	private String managerId;
	private String doj;
	private Double salary;
	private String commission;
	private int departmentNo;
	public Employee(int empId, String name, String designation, String managerId, String doj, Double salary,
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
	public String getManagerId() {
		return managerId;
	}
	public String getDoj() {
		return doj;
	}
	public Double getSalary() {
		return salary;
	}
	public String getCommission() {
		return commission;
	}
	public int getDepartmentNo() {
		return departmentNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		int empId1=o1.getEmpId();
		int empId2=o2.getEmpId();
		int result=0;
		if(empId1==empId2){
			result=0;
		}else if(empId1>=empId2){
			result=1;
		}else if(empId1<=empId2){
			result=-1;
		}
		return result;
		
	}
	
	
	
	

}
