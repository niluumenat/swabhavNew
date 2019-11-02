package com.techlabs.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class preparedStatementTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement prestmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
			System.out.println("Connected database successfully...");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a department number: ");
			String deptNo = sc.nextLine();

			prestmt = conn.prepareStatement("Select * from DEPT where DEPTNO=?");
			prestmt.setString(1, deptNo);
			rs = prestmt.executeQuery();
			System.out.println("DeptNo\tName\t\tLocation\n");
			if (rs.next()) {
				do {
					System.out.print(rs.getString("DEPTNO") + " \t" + rs.getString("DNAME") + "\t "
							+ rs.getString("LOC") + "\n");
				}while(rs.next());
			} else {
				System.out.println("records not found");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (prestmt != null)
					conn.close();
			} catch (SQLException se) {
				System.out.println(se);
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
