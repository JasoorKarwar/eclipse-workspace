package com.syntax.class05;

import java.util.Scanner;

public class ClassTask05_1 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		
		Scanner input=new Scanner (System.in);
		System.out.println("Enter number of worked years");
		int workYear=input.nextInt();
		if(workYear>=5) {
			System.out.println("What is your annual salary?");
			int annualSalary = input.nextInt();
			System.out.println("User is eligible for the bonus");
			if (annualSalary>50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}
		}else {
			System.out.println("Your are not eligible for bonus");
		}
	}

}
