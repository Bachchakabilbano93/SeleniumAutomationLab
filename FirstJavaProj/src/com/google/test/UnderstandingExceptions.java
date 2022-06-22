package com.google.test;

public class UnderstandingExceptions {

	public static void main(String[] args) {
		int res;
		try {
//			res = 4/0;
			int a[] = {1,2,3};
			System.out.println("Printing value at index 2: "+a[2]);
			System.out.println(a[3]);
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Ohh a exception is Arithmetic");
			
		}
		  catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Ohh a exception is IndexOutOfBoundsException");
			 
		}
		  catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Ohh a exception is Exception");
			  
		}
		
		System.out.println("After Try Catch");

	}

}
