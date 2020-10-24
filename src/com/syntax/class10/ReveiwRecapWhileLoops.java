package com.syntax.class10;

import java.util.Scanner;

public class ReveiwRecapWhileLoops {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		char operation;
		double results;
		boolean continueLoop=true;
		
		
		
		
		while(continueLoop) {
		System.out.println("Please Enter two numbers");
		Scanner scanner=new Scanner (System.in);
		num1=scanner.nextDouble();
		num2=scanner.nextDouble();
		System.out.println("Plese Enter the opertation + - * /");
		operation=scanner.next().charAt(0);
			
			if(!(operation=='+' ||operation=='-'||operation=='*'||operation=='/')) {
				System.out.println("Operation not supported");
				continue;
			}
			switch (operation) {
			case'+':
				results=num1 + num2;
				break;
			case'-':
				results=num1 - num2;
				break;
			case'*':
				results=num1 * num2;
				break;
			case'/':
				results=num1 / num2;
				break;
			default:
				results=0;
			}
			System.out.println("Result are " + results);
			System.out.println("Enter Yes to perform more operations and No to terminate the program");
		
			if("No".equals(scanner.next())) {
				continueLoop=false;
			}
		}
	}
}
