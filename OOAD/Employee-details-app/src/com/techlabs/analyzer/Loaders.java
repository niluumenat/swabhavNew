package com.techlabs.analyzer;

import java.io.IOException;
import java.util.HashSet;

import com.techlabs.employee.Employee;

public interface Loaders {
	HashSet<Employee> getContent() throws IOException;

}
