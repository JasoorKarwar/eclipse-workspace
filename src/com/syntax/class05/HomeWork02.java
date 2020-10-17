package com.syntax.class05;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {

		// Write a program to find largest number among three numbers using nested if
		// provided by a user (numbers must be distinct)

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three distinct numbers");

		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		double largest = 0;

		if (x > y) {if (x > z) {largest=x;}}
		
		if (y > x) {if (y > z) {largest=y;} else {largest=z;}}
		
		System.out.println("The largest number is " + largest);
		
	}
	}	