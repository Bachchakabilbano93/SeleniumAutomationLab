package com.google.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
			String qry = "select * from employee";
			
//			Register class
			Class.forName("com.mysql.jdbc.Driver");
		//	Connection    url  dbc:mysql://localhost:3306/dbname
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		//	Statement
			Statement statement = conn.createStatement();
		//	Execute Query
			ResultSet rs = statement.executeQuery(qry);
			
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getString("address"));
				
			} 
//			if (rs.next()) {
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//			}	
		//	Close connection	

	}

}
