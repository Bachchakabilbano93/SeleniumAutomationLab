package com.oracle;

public class ArrayExercise {

	public static void main(String[] args) {
		int[] numArr = {11, 26, 53, 94, 52, 16, 87, 68, 29, 13};


		int tmp;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = i+1; j < numArr.length; j++) {
				if (numArr[i] < numArr[j]) {
					tmp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = tmp;

				}

			}
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}



	}

}


