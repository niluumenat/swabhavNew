package com.techlabs.read.file.test;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileTest {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("resource/ReadMe.txt");
		BufferedReader reader = new BufferedReader(file);

		String text = " ";
		String line = reader.readLine();

		while (line != null) {
			text = text + line;
			System.out.println(line);
			line = reader.readLine();
		}

	}

}
