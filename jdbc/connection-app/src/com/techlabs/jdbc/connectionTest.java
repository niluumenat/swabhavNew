package com.techlabs.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class connectionTest {
	
	public static void main(String[] args)  {
		
        String connectionUrl = "jdbc:mysql://localhost/test?user=root&password=root";
       
		Connection con=null;
		try {
			con = (Connection) DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(con !=null){
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		System.out.println(con.getClass());
	  }

}
