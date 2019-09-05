package com.techlabs.map.collections;

import java.util.Comparator;

public class SortByRollNonStd implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int rollNo1=o1.getRollNo();
		int rollNo2=o2.getRollNo();
		int std1=o1.getStandard();
		int std2=o2.getStandard();
		int result=0;
		if(rollNo1==rollNo2&&std1==std2){
			result=0;
		}else if(rollNo1>=rollNo2 && std1>=std2){
			result=1;
		}else if(rollNo1<=rollNo2 && std1<=std2){
			result=-1;
		}
		return result;
		
	}
	

}
