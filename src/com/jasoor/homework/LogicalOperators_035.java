package com.jasoor.homework;

import java.util.Scanner;

public class LogicalOperators_035 {

	public static void main(String[] args) {

		boolean loan=true;
		String eligibility;
		double score = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you need a loan?");

		loan = scan.nextBoolean();

		if (loan) {
			System.out.println("What is your credit score?");
			score = scan.nextDouble();

			if (score <= 600) {
				eligibility="Not eligible";
				System.out.println("The eligibility is" +" "+ eligibility);
			} else if (score > 600 && score <= 700) {
				eligibility="Maybe eligible";
				System.out.println("The eligibility is" +" "+ eligibility);
			} else if (score >= 701 && score < 800) {
				eligibility="Eligible";
				System.out.println("The eligibility is" +" "+ eligibility);
			} else if (score == 800) {
				eligibility="Definitely eligible";
				System.out.println("The eligibility is" +" "+ eligibility);
			} 
			}else {
				System.out.println("Unknown");
		}
	}
}
