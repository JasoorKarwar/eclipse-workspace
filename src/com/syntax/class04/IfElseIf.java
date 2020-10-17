package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {

		/*
		 * *We need to compare 2 numbers: Bigger, Smaller or Equal
		 */

		int num1 = 19;
		int num2 = 99;

		if (num1 > num2) {// What if this condition is true.
			System.out.println(num1 + " is bigger than " + num2);
		} else if (num1 < num2) {// Or what if this condition is true. (Note: When testing one specific value
									// multiple times we should to type "else" otherwise java will treat it as
									// separate block or condition)
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("----------------------------------------");

		/*
		 * Based on the day of the week we will print class schedule
		 * 
		 */
		int day = 9; //If we put a number which is not between 1 to 7 (or specified/assigned) it will print the "else" statement.

		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday we have Manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we have Manual class again");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we have Review clsas");
		} else if (day == 5) {
			System.out.println("Today is Friday but I will have class tomorrow and I will be prepared");
		} else if (day == 6) {
			System.out.println("Today is Saturday, I miss Java classes");
		} else if (day == 7) {
			System.out.println("Today is Sunday, I did a lot of coding");
		} else {
			System.out.println("This is invalid entry, please provide valid day from 1 to 7");
		}

	}

}
