package com.techlabs.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class statementTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/swabhav?user=root&password=root");
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Creating table in given database...");
			stmt = (Statement) conn.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM DEPT");
			System.out.println(rs);
			while (rs.next()) {
				System.out.println(rs.getString("DEPTNO") + " " 
			+ rs.getString("DNAME") + " " + rs.getString("LOC"));
			}
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
		// end JDBCExample
}
