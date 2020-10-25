package com.syntax.grouptask;

public class MaxMinArr04 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] myArray = { 45, 10, 360, 330, 400, 500 };
		int max = myArray[0];
		int size = myArray.length;
		int min = myArray[size - 1];
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
			if (min > myArray[i]) {
				min = myArray[i];
			}
		}
		System.out.println("the largest number in array is :" + max);
		System.out.println("the smallest number in array is :" + min);
	}

}
