package com.syntax.class10;

public class Homework02 {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it.
		// Using 2 different loops print all elements from the array

		String[] animals = { "Goat", "Cow", "Elephant", "Horse", "Donkey", "Monkey" };

		for (String a : animals) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("------------2nd Way--------------");
		
		
		String[] animals2 = { "Goat", "Cow", "Elephant", "Horse", "Donkey", "Monkey" };

		for (int a=0; a<animals2.length; a++) {
			System.out.print(animals2[a]+" ");
			
		}
	}
}
