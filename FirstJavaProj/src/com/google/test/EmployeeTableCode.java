package com.google.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTableCode {
	
	Connection conn;
	Statement statement;
	
	public void getConnection() throws ClassNotFoundException, SQLException {
//		Register class
		Class.forName("com.mysql.jdbc.Driver");
//		Connection    url  dbc:mysql://localhost:3306/dbname
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
//		Statement
		 statement = conn.createStatement();
		
	}

	public void addEmployee( int eid, String name, String address) throws SQLException {
		String qry = "insert into employee values("+eid+",'"+name+"','"+address+"')";
//		insert into employee values(002, 'temp', 'Magic');
		System.out.println(qry);
		Statement statement = conn.createStatement();
		statement.executeUpdate(qry);
		System.out.println("Inserted record successfully");
	}
	
	public void updateEmployee( int eid, String new_name) throws SQLException {
		String qry = "update employee set name ='"+new_name+"' where Id= '"+eid+"'";
//		insert into employee values(002, 'temp', 'Magic');
		System.out.println(qry);
//		Statement statement = conn.createStatement();
		statement.executeUpdate(qry);
		System.out.println("Updated record successfully");
	}

	
}