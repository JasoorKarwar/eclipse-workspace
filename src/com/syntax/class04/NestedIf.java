package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		/*
		 * Variable for allergy - yes or no
		 * 
		 * If allergy is yes --> 
		 * 						we will check if pet allergy
		 * 									if peanut allergy if
		 * 									pollen allergy
		 * if no allergy you are lucky !!!
		 */

		boolean allergy = true;

		boolean petAllergy = false;

		if (allergy) {// true

			System.out.println("Let's do further check");

			if (petAllergy) {
				System.out.println("please no cats or dogs in the house");
			} else {
				System.out.println("That is good you do not have pet allergy");
			}

		} else {
			System.out.println("You are lucky");
		}

	}

}
