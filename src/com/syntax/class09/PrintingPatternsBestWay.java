package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {

		for (int r = 1; r < 5; r++) {
			for (int c = 1; c <= 6; c++) {
				System.out.println("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		for (int a = 0; a <= 6; a++) {
			for (int b = 1; b <= 12; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		for (int a = 0; a <= 6; a++) {
			for (int b = 1; b <= 12; b++) {
				System.out.print("$");
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print(b);
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		for (int a = 7; a > 0; a--) {
			for (int b = 6; b > 0; b--) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");

		for (int r = 1; r<= 5; r++) {
			for (int a = 7; a >= 1; a--) {
				System.out.print(a);
			}
			System.out.println();
		}

	}

}
