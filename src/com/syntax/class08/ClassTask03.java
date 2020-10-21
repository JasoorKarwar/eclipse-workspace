package com.syntax.class08;

public class ClassTask03 {

	public static void main(String[] args) {
		// Calculate sum of even and odd numbers from range 1 to 50

		int result = 1;
		for (int i = 10; i >= 1; i -= 2) {

			result *= i;
		}
		System.out.println(result);// If print inside the loop, it will print each step of calculation that happens
									// in the process

		System.out.println();
		System.out.println("------------------------------------------------------------");

		// Calculate sum of even and odd numbers from range 1 to 50

		int sumE = 0;
		int sumO = 0;

		for (int n = 1; n <= 50; n++) {
			if (n % 2 == 0) {
				sumE = n + sumE;
			} else {
				sumO = n + sumE;
			}

		}
		System.out.println("Sum of Even Numbers from 1 to 50 is " + sumE);
		System.out.println("Sum of Odd Numbers from 1 to 50 is " + sumO);
	}
}
