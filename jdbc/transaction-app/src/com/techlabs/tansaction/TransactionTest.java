package com.techlabs.tansaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmtAssignment = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/swabhav?user=root&password=root");
			System.out.println("Connected database successfully...");

			conn.setAutoCommit(false);

			pstmt = conn.prepareStatement("UPDATE CUSTMR SET BALANCE=BALANCE-5000 WHERE CUSTOMERID=101");

			pstmt.executeUpdate();

			pstmt = conn.prepareStatement("UPDATE MERCHANT SET BALANCE=BALANCE+5000 WHERE NAME='GGGG'");

			pstmt.executeUpdate();

			conn.commit();

		} catch (SQLException | ClassNotFoundException e) {

			if (conn != null)
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (pstmtAssignment != null)
					pstmtAssignment.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
