package com.techlabs.map.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class StudentTreeMapTest {

	public static void main(String[] args) {
		TreeMap<Student, Student> map = new TreeMap<>(new SortByRollNonStd());
		Student s1 = new Student(101, 10, "abc", 6.7f);
		Student s2 = new Student(103, 15, "xyc", 8.4f);
		Student s3 = new Student(102, 8, "abc", 8.9f);
		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);
		display(map);
	}

	private static void display(Map<Student, Student> map) {
		for (Entry<Student, Student> entry : map.entrySet()) {
			System.out.println("key:" + entry.getKey().getRollNo() + " , " + entry.getKey().getName() + " ,"
					+ entry.getKey().getStandard() + " ," + entry.getKey().getCgpa() + " value "
					+ entry.getValue().getRollNo() + " , " + entry.getValue().getStandard() + " , "
					+ entry.getValue().getName() + " , " + entry.getValue().getCgpa());

		}
	}

}
