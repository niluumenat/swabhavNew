package com.techlabs.analyzer;

import java.util.Comparator;

import com.techlabs.employee.Employee;

public class SortById implements Comparator<Employee>{

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
