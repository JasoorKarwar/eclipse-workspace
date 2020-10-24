package com.syntax.class10;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Create an array on double using scanner and calculate the sum of
		//all elements that was stored in an array.

		Scanner scan;
		double[] num;
		double sum = 0;
		int size;
		scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to add up?");
		size = scan.nextInt();
		
		num = new double[size];
		
		// store values into array
		for (int i = 0; i < size; i++) {
		System.out.println("Please enter double numbers");
		num[i] = scan.nextDouble();
		}
		
		//loop throught created array
		/*
		 * for (int i = 0; i < num.length; i++) { 
		 * sum = sum + num[i]; }
		 */
		
		for(double number:num) { // we can use either the above or this way and it work the same
			
			sum+=number;
		}
		System.out.println(sum);

	}
}
