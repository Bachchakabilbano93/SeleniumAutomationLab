package com.google.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuEmployee {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		EmployeeTableCode emp = new EmployeeTableCode();
		emp.getConnection();


		
				
		boolean cond = true;
		while (cond) {
		System.out.println("Please select a choice");
		System.out.println("1. AddUser\n" + 
				"2. UpdateUser\n" + 
				"3. DeleteUser\n" + 
				"4. Exit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Please enter Id ");
			int eid = scanner.nextInt();
			String name = "name"+eid;
			String address = "address"+eid;
//			insert into table
			
			emp.addEmployee(eid, name, address);
			break;
		case 2:
			System.out.println("Update user: send the id and new name");
			System.out.println("Please enter Id ");
			int eidU = scanner.nextInt();
			System.out.println("Please enter NEW name ");
			String nameU = scanner.next();
			emp.updateEmployee(eidU, nameU);
			
			
			break;
		case 3:
			System.out.println("Delete user: send the id for user to delete");
			break;
		case 4:
			System.out.println("Selected 4");
			cond = false;
			break;
		default:
			System.out.println("Incorrect choice");
			break;
		}

	}
		
		System.out.println("Outside loop");
	}


}
