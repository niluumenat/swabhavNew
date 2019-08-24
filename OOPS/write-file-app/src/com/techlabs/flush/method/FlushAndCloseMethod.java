package com.techlabs.flush.method;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class FlushAndCloseMethod {
	 public static void main(String[] args) {
	      String s = "Hello World";
	      

	      // create a new writer
	      Writer writer = new PrintWriter(System.out);

	      try {
	         // append a string
	         writer.append(s);

	         // flush the writer
	         writer.flush();

	         // append a new string in a new line
	        writer.append("\nThis is an example");

	         // flush the stream again
	        writer.close();
	        
	        writer.append("hiii");
	        

	      } catch (IOException ex) {
	         ex.printStackTrace();
	      }
	   }
}
