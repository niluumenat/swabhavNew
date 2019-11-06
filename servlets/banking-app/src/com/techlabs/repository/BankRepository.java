package com.techlabs.repository;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.BankingMaster;
import com.techlabs.model.BankingTransaction;

public class BankRepository {
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement prestmt = null;
	private ResultSet rs = null;
	private List<BankingMaster> master = null;
	private List<BankingTransaction> trans = null;

	public BankRepository() {

	}

	private Connection initializeConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/swabhav?user=root&password=root");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected database successfully...");
		return conn;

	}

	public void add(BankingMaster master, BankingTransaction transaction) {
		initializeConnection();
		System.out.println("Hello from add repository..");

		try {
			conn.setAutoCommit(false);

			prestmt = conn.prepareStatement("INSERT INTO MASTER(NAME,PASSWORD,BALANCE) VALUES(?,?,?)");
			prestmt.setString(1, master.getName());
			prestmt.setString(2, master.getPassword());
			prestmt.setString(3, master.getBalance());

			prestmt.executeUpdate();
			prestmt = conn.prepareStatement("INSERT INTO TRANSACTION(NAME,AMOUNT,TYPE,DATE) VALUES(?,?,?,?)");
			prestmt.setString(1, transaction.getName());
			prestmt.setString(2, transaction.getAmount());
			prestmt.setString(3, transaction.getType());
			prestmt.setString(4, transaction.getDate());

			prestmt.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean get(String userName, String password) {
		initializeConnection();
		System.out.println("Hello from get repository method..");
		master = new ArrayList<BankingMaster>();
		try {
			prestmt = conn.prepareStatement("SELECT EXISTS(SELECT * from master WHERE name=? and password=?)");
			prestmt.setString(1, userName);
			prestmt.setString(2, password);

			rs = prestmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				if (Integer.parseInt(rs.getString(1)) == 1) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public List<BankingMaster> getByName(String name) {
		initializeConnection();
		ResultSet rs = null;
		master = new ArrayList<BankingMaster>();
		try {
			prestmt = conn.prepareStatement("SELECT * FROM master WHERE name=?");
			prestmt.setString(1, name);
			rs = prestmt.executeQuery();

			while (rs.next()) {
				BankingMaster b1 = new BankingMaster(rs.getString(1), rs.getString(2), rs.getString(3));
				master.add(b1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return master;
	}
	
	public List<BankingTransaction> getByNameTrans(String name){
		initializeConnection();
		ResultSet rs = null;
		trans = new ArrayList<BankingTransaction>();
		try {
			prestmt = conn.prepareStatement("SELECT * FROM transaction WHERE name=? order by date desc");
			prestmt.setString(1, name);
			rs = prestmt.executeQuery();

			while (rs.next()) {
				BankingTransaction t1 = new BankingTransaction(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
				trans.add(t1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return trans;
		
	}

	public void update( BankingTransaction transaction) {
		initializeConnection();
		System.out.println("Hello from update repository..");

		try {
			conn.setAutoCommit(false);
			if (transaction.getType().equals("deposit")) {
				System.out.println("Hello from deposit ");
				prestmt = conn.prepareStatement("UPDATE MASTER SET BALANCE=BALANCE+? WHERE NAME=?");
				prestmt.setString(1, transaction.getAmount());
				prestmt.setString(2, transaction.getName());
				prestmt.executeUpdate();

			} else if (transaction.getType().equals("withdraw")) {
				System.out.println("Hello from withdraw");
				prestmt = conn.prepareStatement("UPDATE MASTER SET BALANCE=BALANCE-? WHERE NAME=?");
				prestmt.setString(1, transaction.getAmount());
				prestmt.setString(2, transaction.getName());
				prestmt.executeUpdate();
			}
			prestmt = conn.prepareStatement(
					"INSERT INTO TRANSACTION(NAME,AMOUNT,TYPE,DATE)VALUES(?,?,?,?)");
			prestmt.setString(1, transaction.getName());
			prestmt.setString(2, transaction.getAmount());
			prestmt.setString(3, transaction.getType());
			prestmt.setString(4, transaction.getDate());
			prestmt.executeUpdate();
			
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
