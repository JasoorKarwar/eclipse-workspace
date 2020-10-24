package com.syntax.class10;

public class Class09ForLoopRecap {

	public static void main(String[] args) {

		boolean condition = true;

		for (int i = 1; i <= 3; i++) {

			System.out.println("I am for loop");

			while (condition) {
				System.out.println("I am while loop");

				break;
			}
		}

	}

}
