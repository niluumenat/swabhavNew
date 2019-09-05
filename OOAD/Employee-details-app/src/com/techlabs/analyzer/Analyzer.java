package com.techlabs.analyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.techlabs.employee.Employee;

public class Analyzer {
	Loaders loaders;

	public Analyzer(Loaders loaders) {
		super();
		this.loaders = loaders;
	}
	
	

	public Employee getMaxSalariedEmployee() throws IOException {
		double maxx=0;
		if (loaders.getContent().isEmpty() || loaders.getContent() == null)
			return null;
		for(Employee employee:loaders.getContent()){
			maxx=employee.getSalary();
			if(employee.getSalary()> maxx)	{
				maxx=employee.getSalary();
			}
		}
		Employee e1 = null;
		for (Employee e : loaders.getContent()) {
			if (e.getSalary() == maxx)
				e1 = e;
		}

		return e1;
	}

	public Map<String, Integer> countByDesignation() throws IOException {
		HashMap<String, Integer> count1 = new HashMap<>();
		System.out.println("Counting Employees based on Designation: ");
		for (Employee e : loaders.getContent()) {
			if (count1.containsKey(e.getDesignation())) {
				count1.put(e.getDesignation(), count1.get(e.getDesignation()) + 1);
			} else {
				count1.put(e.getDesignation(), 1);
			}
		}

		return count1;

	}

	public Map<Integer, Integer> countByDepartment() throws IOException {
		HashMap<Integer, Integer> count2 = new HashMap<Integer, Integer>();
		System.out.println("Counting Employees based on Department Number");
		for (Employee e : loaders.getContent()) {
			if (count2.containsKey(e.getDepartmentNo())) {
				count2.put(e.getDepartmentNo(), count2.get(e.getDepartmentNo()) + 1);
			} else {
				count2.put(e.getDepartmentNo(), 1);
			}
		}

		return count2;

	}

}
