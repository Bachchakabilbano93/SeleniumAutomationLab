package com.google.test;

import java.util.Scanner;

public class PracWhileLoop {

	public static void main(String[] args) {
		
//		int a = 5;
		boolean cond = true;
		while (cond) {
			System.out.println("Please enter a number");
			Scanner scanner = new Scanner(System.in);
			
			int a = scanner.nextInt();
			
			System.out.println(a);
			if (a == 0) {
				cond = false;
			}
			
			
		}

	}

}
