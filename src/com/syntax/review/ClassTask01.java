package com.syntax.review;

public class ClassTask01 {

	public static void main(String[] args) {
		// find the largest number form the array?

		int[] array = { 10, 1000, 20, 8, -1, 77, 56, };

		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("The largest number from an arry is " +max);

	}

}
