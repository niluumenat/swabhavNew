package com.techlabs.write.file.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		String fileContent = "hello";

		FileWriter fileWriter = new FileWriter("resources/WriteMe.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(fileContent);
		printWriter.println("My name is Nilam Menat");
		printWriter.close();
		
	}

}
