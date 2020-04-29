package com.sprintqa.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtils {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ========================== CONNNET ================================
		// Register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish connection
		Connection conObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root",
				"Trust@123");
		
		// ========================== Query ================================

		// Creating statement
		Statement stmt = conObject.createStatement();
		// Query
		
		
		
		int rowCount = stmt.executeUpdate("insert into course values (8, 'test', 12, 'test');");
		
		System.out.println(rowCount+ "row/s updated");

		// ========================== Getting result ================================

//		while (rs.next()) {
//			System.out
//					.println(rs.getString("productLine") + " " + rs.getInt("total_qty"));
//		}

		conObject.close();
	}
	
	
	//Display department wise instructor with their max salary from dept table
}
