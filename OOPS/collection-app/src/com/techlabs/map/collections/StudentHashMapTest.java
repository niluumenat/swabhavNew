package com.techlabs.map.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class StudentHashMapTest {
	public static void main(String[] args) {
		Map<Student, Student> map = new HashMap<Student, Student>();
		Student s1 = new Student(101, 10, "abc", 6.7f);
		Student s2 = new Student(101, 10, "xyc", 8.4f);
		
		map.put(s1, s1);
		map.put(s2, s2);
		display(map);

	}

	private static void display(Map<Student, Student> map) {
		for (Entry<Student, Student> entry : map.entrySet()) {
			System.out.println("key:" + entry.getKey().getRollNo() + " , " + entry.getKey().getName() + " ,"
					+ entry.getKey().getStandard() + " ," + entry.getKey().getCgpa() + " value: "
					+ entry.getValue().getRollNo() + " , " + entry.getValue().getStandard() + " ,"
					+ entry.getKey().getName() + ", " + entry.getValue().getCgpa());

		}
	}
}
