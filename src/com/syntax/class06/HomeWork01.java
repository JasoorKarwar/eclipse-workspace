package com.syntax.class06;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		
		String language;
		Scanner scan = new Scanner(System.in);
		System.out.println("Where are you from?");
		String country = scan.nextLine().toLowerCase();

		switch (country) {

		case "usa":
			language = " US English";
			break;

		case "afghanistan":
			language = " Pashto/Dari";
			break;

		case "russia":
			language = " Russian";
			break;

		case "france":
			language = " French";
			break;

		default:
			language = " NOT VALID IN THE SYSTEM";
		}
		System.out.println("Your National language is:" + language);
	}
}
