package com.syntax.class10;

public class ClassTask2 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Print all values from the array.
		
		String[] cars= {"Honda", "Mercedes" ,"Toyota", "Nissan", "Infiniti", "Lamborgini"};
		for (int c=0; c<cars.length; c++) {
			System.out.print(cars[c]+" ");
		}
		
		System.out.println();
		
		System.out.println("--------getting values from array using enhanced for loop--------");
		
		/* for (: name of the array) */
		
		for (String car:cars) {
			System.out.print(car +" ");	
		}
		
		System.out.println("--------getting values from array using enhanced for loop--------");
		
		int[] numbers= {10,10,90,600,89};
		for(int num :numbers) {
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("--------getting values from array using enhanced for loop--------");
		
		boolean[] arrayofBoolean= {true, true, false, true};
		
		for(boolean boo:arrayofBoolean) {
			System.out.println(boo);
		}
		

	}

}
