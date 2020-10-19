package com.syntax.class08;

public class ClassTask01 {

	public static void main(String[] args) {

		for (int a = 20; a >= 1; a--) {

			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.println("------------odd numbers 20 and 50--------------");
		for (int a=20; a<50; a++) {
			if (a%2!=0) {
				System.out.println(a+" ");
			}
		}
		System.out.println();
		System.out.println("---------------------------");
		
		
	}

}
