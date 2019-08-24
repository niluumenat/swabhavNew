package com.techlabs.polymorphism.employee.test;

import com.techlabs.polymorphism.employee.Developer;
import com.techlabs.polymorphism.employee.Employee;
import com.techlabs.polymorphism.employee.Manager;
import com.techlabs.polymorphism.employee.Tester;

public class EmployeeTest {
	public static void main(String[] args) {
		Manager manager = new Manager(101, "nilu", 2450);
		printSalarySlip(manager);

		Developer developer = new Developer(102, "hetu", 3000);
		printSalarySlip(developer);

		Tester tester = new Tester(103, "madhavi", 4000);
		printSalarySlip(tester);

	}

	public static void printSalarySlip(Employee employee) {

		System.out.println(" Employee no:" + employee.getEmpNo() + " Employee name:" + employee.getEmpName()
				+ " Employee Salary:" + employee.getEmpBasicSalary() + " CTC:" + employee.calCTC() + "Details are:"
				+ employee.salaryDetails());

	}

}
