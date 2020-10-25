package com.syntax.grouptask;

public class SeconLargestNum05 {

	public static void main(String[] args) {
		// write a java program to find the second largest number in the array?

		int largest = 0;
		int secondLargest = 0;

		int[] array = { 10, 1000, 20, 8, -1, 80, 20, 56, };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}

		System.out.println("The 2nd Largest number is: " + secondLargest);
	}

}
