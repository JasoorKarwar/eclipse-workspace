package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int num=90;
		num=num+1;
		
		num+=1;
		System.out.println(num);
		
		num++;  //adding 1
		System.out.println(num);
		
		int num1=100;
		
		num1-=1;
		num1--;
		System.out.println(num1);
		
		//100--; CE
		// increment & decrement operators can be used ONLY with variables
		
		System.out.println("--------------------------- ----------------------------");
		
		//If I want to write something multiple times, this is not the logical or right approach to write it multiple times
		//instead we use "Loops" to execute same block of codes multiple times. Loop helps to avoid repetative code writing.
		System.out.println("Hello"); //If I want to write something multiple times, this not the logical or right approach:
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		

	}

}
