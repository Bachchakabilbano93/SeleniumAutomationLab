package com.oracle;

public class ShuffleValues {

	public static void main(String[] args) {
		int a = 10;
		
		int b = 20;
		
		System.out.println(a +" - "+ b);
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After shufflling");
		System.out.println(a + " - "+ b);

	}

}
