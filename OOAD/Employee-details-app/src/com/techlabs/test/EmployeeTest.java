package com.techlabs.test;

import java.io.IOException;
import java.util.Map;

import com.techlabs.analyzer.Analyzer;
import com.techlabs.analyzer.Loaders;
import com.techlabs.employee.Employee;
import com.techlabs.loaders.FileLoader;
import com.techlabs.loaders.URLLoader;

public class EmployeeTest {
	public static void main(String[] args) throws IOException {
		Loaders loaders=new FileLoader();
		Loaders loader1 = new URLLoader();
		
		Analyzer analyzer = new Analyzer(loader1);
		
		printMaxSalariedEmployee(analyzer.getMaxSalariedEmployee());
		printDesignationWiseCount(analyzer.countByDesignation());
		printDepartmentWiseCount(analyzer.countByDepartment());

	}

	private static void printMaxSalariedEmployee(Employee employee) {
		System.out.println("Employee with highest salary: " + employee.getEmpId() + " " + employee.getName() + " "
				+ employee.getDesignation() + " " + employee.getSalary());

	}

	private static void printDepartmentWiseCount(Map<Integer, Integer> countByDepartment) {
		for (Map.Entry<Integer, Integer> entry : countByDepartment.entrySet()) {
			System.out.println(" Department number-" + entry.getKey() + " : " + entry.getValue());
		}
	}

	private static void printDesignationWiseCount(Map<String, Integer> countByDesignation) {
		for (Map.Entry<String, Integer> entry : countByDesignation.entrySet()) {
			System.out.println("Designation-" + entry.getKey() + " : " + entry.getValue());
		}
	}


}
