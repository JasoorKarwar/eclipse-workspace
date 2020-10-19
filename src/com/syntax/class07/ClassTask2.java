package com.syntax.class07;

public class ClassTask2 {

	public static void main(String[] args) {

		System.out.println("---------------While Loop-------------");
		int a=20;
		//first we check condition
		while(a<15) {
			System.out.println("Hello"); //do something
			a++;
		}
		
		System.out.println("---------------Do Loop-------------");
		int b=10;
		//first do something
		do {
			System.out.println("Hi");
			b++;
			}while(b<15);//then check the condition
	}
}
