package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {

		int time = 15;

		if (time > 12) { // CONDITION IS TRUE
			System.out.println("good day");// CODE EXECUTE 1 TIME
		}
		System.out.println("---------------------WHILE LOOP");

//		while (time>12) {
//			System.out.println("good day"); //INFINITE LOOP
//	        }
//			while (time>12) {
//				System.out.println("good day"); 
//			time++;
//		}
		while (time > 12) {
			System.out.println("good day");
			time--;
		}

		// I want to print numbers from 1 to 50
		System.out.println("PRINT NUMBERS 1 TO 50 -------");
		int num = 1;

		while (num <= 50) {
			System.out.println(num);
			num++;
		}
		// I want ot print numbers from 10 to 60
		System.out.println("PRINT NUMBERS 10 TO 60 -------");
		int a = 10;

		while (a <= 60) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println("PRINT NUMBERS 100 TO 60 -------");
		int b = 100;

		while (b<=60) {
			System.out.print(b+" ");
			b--;
		}
		
		/*
		 * System.out.println("PRINTING UNMBERS 10 TO 30 ONLY EVEN-----------------");
		 * int c=10;
		 * 
		 * while (c<31) { if (c%2==0) { System.out.println(c+" "); } c++; }
		 */
		
		int d=10;
		
		while (d<=30) {
			System.out.println(d+" ");
			d+=2;
		}
		System.out.println(" -- Another Way----");
		int c=10; //10<11==>condition is true
		
		while (c<31) {
			if (c%2==0) { //condition is true, but code will stuck in infinite if we put c++; after "System.out.println(c+" ")";
				System.out.println(c+" ");
				//c++; //
			}
			c++;
		}
		
		int e=100; 
		
		while (e>=1) {
			if (e%2!=0) {
				System.out.println(e+" ");
			}
			c++;
		}
	}
}
