package com.techlabs.polymorphism.employee;

public class Developer extends Employee {
	private final double PA = 0.4 * empBasicSalary;
	private final double TA = 0.3 * empBasicSalary;

	public Developer(int empNo, String empName, double empBasicSalary) {
		super(empNo, empName, empBasicSalary);
	}

	public double getPA() {
		return PA;
	}

	public double getTA() {
		return TA;
	}

	@Override
	public double calCTC() {

		double totalSalary = (PA + TA) * 12;
		return totalSalary;
	}

	@Override
	public String salaryDetails() {
		return "PA: " + getPA() + " TA: " + getTA();
	}

}
