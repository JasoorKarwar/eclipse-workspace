package com.syntax.class07;

public class ClassTask01 {

	public static void main(String[] args) {

		System.out.println("PRINT NUMBERS 100 TO 1 (odd numbers only)");
		int e = 100;

		while (e >= 1) {
			if (e % 2 != 0) {
				System.out.print(e + " ");
			}
			e--;
		}
		
		String day="Saturday";
		
		if (day.equals("Saturday")) {
			System.out.println("My favorite Java class");//1
		}
		
		/*
		 * while (day.equals("Satureday")) {
		 * System.out.println("My favorite Java class");}//infinite
		 */
		System.out.println("------------------------------");
		boolean isItBreakTime=true;
		
		if (isItBreakTime) {
			
		}
	}
}
