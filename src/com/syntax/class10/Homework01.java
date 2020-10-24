package com.syntax.class10;

public class Homework01 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an
		// array.

		int[] array = { 20, 40, 60, 70 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum of all elements = "+sum);

	}

}
