package com.techlabs.student.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.techlabs.student.Student;

public class TestSerialization {

	public static void main(String[] args) throws IOException {
		ArrayList<Student> list=new ArrayList<>();
		Student student1=new Student(20, 7.45f);
		Student student2=new  Student(21, 6.8f);
		list.add(student1);
		list.add(student2);
		try {
			FileOutputStream fs = new FileOutputStream(
					"C:/swabhavRepository/homework/Serialization/src/resources/StudentDetails.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(list);
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Student student:list){
			System.out.println("Age: "+student.getAge()+" Cgpa: "+student.getCgpa());
		}

	}

}
