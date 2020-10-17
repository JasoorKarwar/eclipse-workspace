package com.syntax.class05;

import java.util.Scanner;

public class ScannerIf {

	public static void main(String[] args) {
		
		Scanner scan;
		boolean answer;
		double balance;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if you have a credit card (true/false)");
		
		answer=scan.nextBoolean();
		
		if(answer) {
			System.out.println("What is the balance on your card");
			balance=scan.nextDouble();
			
			if (balance>1000) {
				System.out.println("Please pay off your card balance");
			}else {
				System.out.println("You can spend more $$");
			}
		}else {
			System.out.println("Would like to get a credit card?");
		}
		

	}

}
