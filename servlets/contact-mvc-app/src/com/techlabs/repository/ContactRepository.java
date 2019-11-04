package com.techlabs.repository;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.techlabs.model.Contact;

public class ContactRepository {
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement prestmt = null;
	private List<Contact> contact = null;

	public ContactRepository() {

	}

	private Connection initializeConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/swabhav?user=root&password=root");
			System.out.println("Connected database successfully...");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

	public List<Contact> get() {
		initializeConnection();
		ResultSet rs = null;
		contact = new ArrayList<Contact>();
		try {
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM CONTACT");
			System.out.println(rs);

			while (rs.next()) {
				System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
				Contact c1 = new Contact(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				contact.add(c1);
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
		return contact;
	}

	public void add(Contact contact1) {
		initializeConnection();
		try {
			prestmt = conn.prepareStatement("INSERT INTO CONTACT(FIRSTNAME,LASTNAME,PHONENO,EMAILID) VALUES(?,?,?,?)");
			prestmt.setString(1, contact1.getFirstname());
			prestmt.setString(2, contact1.getLastName());
			prestmt.setString(3, contact1.getPhoneNo());
			prestmt.setString(4, contact1.getEmailId());

			prestmt.executeUpdate();

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
	}

	public void delete(String id) {
		initializeConnection();
		try {
			prestmt = conn.prepareStatement("DELETE FROM CONTACT WHERE ID=? ");
			prestmt.setString(1, id);

			prestmt.executeUpdate();
			System.out.println("Record deleted successfully..");
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
	}

	public List<Contact> getByName(String id) {
		initializeConnection();
		ResultSet rs = null;
		contact = new ArrayList<Contact>();
		try {
			prestmt = conn.prepareStatement("SELECT * FROM CONTACT WHERE ID=?");
			prestmt.setString(1, id);
			rs = prestmt.executeQuery();

			while (rs.next()) {
				Contact c1 = new Contact(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				contact.add(c1);
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
		return contact;
	}

	public void edit(String id, Contact contact) {
		initializeConnection();
		try {
			prestmt = conn
					.prepareStatement("UPDATE CONTACT SET FIRSTNAME=?, LASTNAME=?, PHONENO=?,EMAILID=?  WHERE ID=?");
			prestmt.setString(1, contact.getFirstname());
			prestmt.setString(2, contact.getLastName());
			prestmt.setString(3, contact.getPhoneNo());
			prestmt.setString(4, contact.getEmailId());
			prestmt.setString(5, id);

			prestmt.executeUpdate();
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

	}

}
