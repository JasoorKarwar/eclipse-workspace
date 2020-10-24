package com.syntax.class10;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		// Create an array on countries.
		//While retrieving all values from an array print capital for each country.
		
		String[] countries = { "USA", "Afghanistan", "France", "Janpan" };
		String[] capitals = { "DC", "Kabul", "Paris" };
		/*
		 * for (int v = 0; v < countries.length; v++) {
		 * System.out.println("The capital of " + countries[v] + " is " + capitals[v]);
		 * }
		 */
		
		System.out.println("--------------------another way----------------------");
		
		String capital;
		
		for (String country:countries) {
			switch(country){
				case "USA":
					capital ="DC";
					break;
				case "Afghanistan":
					capital ="Kabul";
					break;
				case "France":
					capital ="Paris";
					break;
				default:
					capital="I do not know";
			}
		System.out.println("Capital of the " +country+ " is " + capital);

	}
}
}