package com.dalneg.portfolio.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {

	public TestDB() {
		// TODO Auto-generated constructor stub
		String driverClass = "org.apache.derby.jdbc.EmbeddedDriver";
		String url = "jdbc:derby:school_data;create=true";
		// String databaseURL = "jdbc:derby:/d:/projects/booksdb;create=true";
		String databaseUser = "";
		String databasePassword = "";
		System.out.println("Echo");
		try {
			Class.forName(driverClass);
			Connection con = DriverManager.getConnection(url, databaseUser, databasePassword);
			con.setAutoCommit(true);
			Statement st = con.createStatement();
			
			String createSQL="CREATE TABLE STUDENTS ( NAME CHAR(50) NOT NULL,AGE INT, GENDER CHAR(20) )" ;
					 st.executeUpdate(createSQL);
				

		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			 System.out.println("SQL Exception createStudentsTable() " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestDB();

	}

}
