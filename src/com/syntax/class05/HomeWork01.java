package com.syntax.class05;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {

		//* Write a program to find largest of three double values using if-else..if and logical operators provided by a user (numbers must be distinct
		
		Scanner largest;
		double a;
		double b;
		double c;

		largest = new Scanner(System.in);
		System.out.println("Enter three distinct numbers and find the largest one!");
		a = largest.nextDouble();
		b = largest.nextDouble();
		c = largest.nextDouble();

		if (a > b && a > c) {
			System.out.println("(a) is the largest number");

		} else if (b > a && b > c) {
			System.out.println("(b) is the largest number");

		} else {
			System.out.println("(c) is the largest number");
		}

	}
}