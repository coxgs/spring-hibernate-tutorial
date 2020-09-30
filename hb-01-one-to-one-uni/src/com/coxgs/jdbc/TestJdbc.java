package com.coxgs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:postgresql://localhost:5432/hb_student_tracker";
		String user = "hbstudent";
		String password = "hbstudent";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Connection successful!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
