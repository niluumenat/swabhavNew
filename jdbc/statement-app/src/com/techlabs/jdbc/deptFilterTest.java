package com.techlabs.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class deptFilterTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
			System.out.println("Connected database successfully...");
			
			stmt = (Statement) conn.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a department number: ");
			String deptNo = sc.nextLine();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM DEPT WHERE DEPTNO="+deptNo);
			
			while(rs.next()){
				System.out.println(rs.getString("DNAME")+ " "+ rs.getString("LOC"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {System.out.println(se);
			} 
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		}

	}

}
