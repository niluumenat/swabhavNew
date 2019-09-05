package com.techlabs.loaders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import com.techlabs.analyzer.Loaders;
import com.techlabs.employee.Employee;

public class FileLoader implements Loaders{
	HashSet<Employee> employees;
	
	public FileLoader() {
		super();
		this.employees = new HashSet<Employee>();
	}

	public HashSet<Employee> getContent() throws FileNotFoundException {
		FileReader f=new FileReader("Resources/data.txt");

		try (BufferedReader br = new BufferedReader(f)) {

			String line = br.readLine();

			while (line != null) {
				String[] attributes = line.split(",");
				
				int id = Integer.parseInt(attributes[0]);
				String name = attributes[1];
				String designation = attributes[2];
				String managerId = attributes[3];
				String doj = attributes[4];
				Double salary = Double.parseDouble(attributes[5]);
				String commission = attributes[6];
				int departmentNo = Integer.parseInt(attributes[7]);
				Employee emp=new Employee(id, name, designation, managerId, doj, salary, commission, departmentNo);
				employees.add(emp);
				
				line = br.readLine();
	
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return employees;

	}

	

}
