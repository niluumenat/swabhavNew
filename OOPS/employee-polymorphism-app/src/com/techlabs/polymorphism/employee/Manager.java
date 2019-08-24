package com.techlabs.polymorphism.employee;

public class Manager extends Employee {
	private final int HRA = (int) (0.5 * empBasicSalary);
	private final int TA = (int) (0.4 * empBasicSalary);
	private final int BONUS = (int) (0.3 * empBasicSalary);

	public Manager(int empNo, String empName, double empBasicSalary) {
		super(empNo, empName, empBasicSalary);
	}

	public double getHRA() {
		return HRA;
	}

	public double getTA() {
		return TA;
	}

	public double getBONUS() {
		return BONUS;
	}

	@Override
	public double calCTC() {
		double totalSalary = empBasicSalary = (HRA + TA + BONUS) * 12;
		return totalSalary;
	}

	@Override
	public String salaryDetails() {
		return "HRA:" + getHRA() + " TA:" + getTA() + " Bonus:" + getBONUS();
	}

}
