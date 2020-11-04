package com.syntax.class11;

public class ClassTask03 {

	public static void main(String[] args) {
		// Create a 2D array of food:
		// american
		// italian
		// asian
		// afghani
		// indian

		String[][] food = { { "steak", "hot dog", "cheesburger" }, { "pizza", "pasta", "canoli" },
				{ "sushi", "ramen", "fried rice", "dumplings" }, { "kebab", "manto" },
				{ "beriyani", "masal", "curry", "Chicken tikka masala" }, };
		for (String[] dishes : food) {
			for (String dish : dishes) {
				System.out.println(dish + "   ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		int j;
		for (int i = 0; i < food[0].length; i++) {
			for (j = 0; j < food[1].length; j++) {
				System.out.println(food[i][j] + " ");
			}
			System.out.println();
		}
	}
}
