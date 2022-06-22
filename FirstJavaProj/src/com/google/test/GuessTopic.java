package com.google.test;

public class GuessTopic {

	public static void main(String[] args) {
//		char c = 'a';
//		System.out.println(c);
//		
//		int i = c;
//		System.out.println(i);
		
//		String strnum = "2";
//		
//		int num = Integer.valueOf(strnum);
//		System.out.println(num);
		
		int i = (int) 43.5;
		System.out.println(i);
		
		String strnum = "ABC";
		
		try {
			int num = Integer.valueOf(strnum);
			System.out.println(num);
			
		} 
		catch (NumberFormatException e) {
			System.out.println("Number format exception");
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Done");
		
		

	}

}
