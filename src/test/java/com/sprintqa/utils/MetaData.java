package com.sprintqa.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class MetaData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		DatabaseMetaData  - Meta data

//		ResultSetMetaData - result about meta data

		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish connection
		Connection conObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root",
				"Trust@123");

		DatabaseMetaData dataAboutDataBase = conObject.getMetaData();
		System.out.println(dataAboutDataBase.getDatabaseProductName());
		System.out.println(dataAboutDataBase.getDatabaseProductVersion());
		
		Statement stmt = conObject.createStatement();
		// Query
		ResultSet rs = stmt.executeQuery("select * from customers;");
		ResultSetMetaData metaData = rs.getMetaData();

	}
}
