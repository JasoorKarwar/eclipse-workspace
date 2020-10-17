package com.syntax.class06;

import java.util.Scanner;

public class ClassTaskSwitch {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, OR C etc) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade");
		String grade = scan.nextLine().toLowerCase();

		String explanation;

		switch (grade) {
		case "a":
			explanation = "Excellent";
			break;
		case "b":
			explanation = "Good";
			break;
		case "c":
			explanation = "Average";
			break;
		case "d":
			explanation = "Bad";
			break;
		default:
			explanation = "Not Acceptable";
		}
		System.out.println(grade.toUpperCase() + " is " + explanation);

	}

}
