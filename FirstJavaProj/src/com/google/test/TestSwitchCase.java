package com.google.test;

import java.util.Scanner;

public class TestSwitchCase {

	public static void main(String[] args) {
		boolean cond = true;
		while (cond) {
			
		
		System.out.println("Please select a choice");
		
		System.out.println("1. AddUser\n" + 
					"2. UpdateUser\n" + 
					"3. DeleteUser\n" +
					"4. Exit");
//		System.out.println("If the choice is incorrect\nThen user will be asked to enter choice again");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
//		int choice = 1;

		switch (choice) {
		case 1:
			System.out.println("Selected 1");
			break;
		case 2:
			System.out.println("Selected 2");
			break;
		case 3:
			System.out.println("Selected 3");
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
