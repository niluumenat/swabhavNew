package com.techlabs.loaders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;

import com.techlabs.analyzer.Loaders;
import com.techlabs.employee.Employee;

public class URLLoader implements Loaders {
	HashSet<Employee> employees;

	public URLLoader() {
		super();
		this.employees = new HashSet<Employee>();
	}

	@Override
	public HashSet<Employee> getContent() throws IOException {
		String theUrl = " https://swabhav-tech.firebaseapp.com/emp.txt ";
		StringBuilder content = new StringBuilder();
		try {
			URL url = new URL(theUrl);
			URLConnection connection = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = br.readLine()) != null) {
				content.append(line + "\n");
				String[] attributes = line.split(",");
				int id = Integer.parseInt(attributes[0]);
				String name = attributes[1];
				String designation = attributes[2];
				String managerId = attributes[3];
				String doj = attributes[4];
				Double salary = Double.parseDouble(attributes[5]);
				String commission = attributes[6];
				int departmentNo = Integer.parseInt(attributes[7]);

				Employee emp = new Employee(id, name, designation, managerId, doj, salary, commission, departmentNo);
				;

				employees.add(emp);
				line = br.readLine();
			}
			br.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;

	}

}
