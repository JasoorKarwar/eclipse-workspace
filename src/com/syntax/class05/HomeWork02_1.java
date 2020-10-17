package com.syntax.class05;

import java.util.Scanner;

public class HomeWork02_1 {

	public static void main(String[] args) {

		// Write a program to find largest number among three numbers using nested if
		// provided by a user (numbers must be distinct)

		Scanner largest;
		double a, b, c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three distinct numbers");
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		if (a > b) {
			if (a > c);
			System.out.println("The largest number is: " +a);
		
		}else{
		 if (b > a){
				 if (b > c);
				System.out.println("The largest number is: " +b);
		}else
			System.out.println("The largest number is:" +c);
 }
 }
}
		