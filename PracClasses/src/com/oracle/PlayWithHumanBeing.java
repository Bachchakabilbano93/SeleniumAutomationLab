package com.oracle;

public class PlayWithHumanBeing {

	public static void main(String[] args) {
		HumanBeing Abir = new HumanBeing();
		
		System.out.println(Abir.state);
		Abir.CallIdiot();
		System.out.println(Abir.state);
		Abir.CallBeautiful();
		System.out.println(Abir.state);

	}

}
