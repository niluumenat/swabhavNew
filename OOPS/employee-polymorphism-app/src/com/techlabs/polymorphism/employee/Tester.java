package com.techlabs.polymorphism.employee;

public class Tester extends Employee {
	private final double BONUS = 0.3 * empBasicSalary;

	public Tester(int empNo, String empName, double empBasicSalary) {
		super(empNo, empName, empBasicSalary);
	}

	public double getBONUS() {
		return BONUS;
	}

	@Override
	public double calCTC() {
		double totalSalary = BONUS * 12;
		return totalSalary;
	}

	@Override
	public String salaryDetails() {
		return " BONUS: " + getBONUS();
	}

}
