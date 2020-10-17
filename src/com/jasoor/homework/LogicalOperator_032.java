package com.jasoor.homework;

import java.util.Scanner;

public class LogicalOperator_032 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your gender: M or F");
		char gender = input.next().charAt(0);

		System.out.println("Please enter your age");
		int age = input.nextInt();

		if (age > 25) {
			if (gender == 'f') {
				System.out.println("Woman");
			} else {
				System.out.println("Man");
			}
		}
		else if (age <= 25) {
			if (gender == 'f') {
				System.out.println("Girl");
		} else {
			System.out.println("Boy");
		}
	}
	}
}