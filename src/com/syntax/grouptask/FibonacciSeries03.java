package com.syntax.grouptask;

public class FibonacciSeries03 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		int numberLimit = 10;
		long[] seriesOfNumbers = new long[numberLimit];
		seriesOfNumbers[0] = 0;
		seriesOfNumbers[1] = 1;
		for (int i = 2; i < numberLimit; i++) {
			seriesOfNumbers[i] = seriesOfNumbers[i - 1] + seriesOfNumbers[i - 2];
		}
		System.out.println("The first " + numberLimit + " numbers of the Fibonacci Sequence:");
		for (int i = 0; i < numberLimit; i++) {
			System.out.print(seriesOfNumbers[i] + " ");
		}
	}

}
