package com.google.test;

public class Sum_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 12;
		int num2 = 25;
		int sum = 0;
		
		sum = num1 + num2;
		System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
//		== > < >= <=		
		if (num1 > 10) {
			System.out.println("num1 > 10");
			System.out.println("one more statement");
			num1 = num1 - 10;
		} else {
			System.out.println("num1 <= 10");

		}
		
		System.out.println(num1);

	}

}
