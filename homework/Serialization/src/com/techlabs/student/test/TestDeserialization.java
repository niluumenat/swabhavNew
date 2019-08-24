package com.techlabs.student.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.techlabs.student.Student;

public class TestDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Student> alist = new ArrayList<>();

		try {
			FileInputStream fs = new FileInputStream(
					"C:/swabhavRepository/homework/Serialization/src/resources/StudentDetails.txt");
			ObjectInputStream os = new ObjectInputStream(fs);
			alist = (ArrayList<Student>) os.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Student student : alist) {
			System.out.println("Age: " + student.getAge() + "Cgpa: " + student.getCgpa());
		}

	}

}
