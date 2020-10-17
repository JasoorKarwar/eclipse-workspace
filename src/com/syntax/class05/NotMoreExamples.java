package com.syntax.class05;

public class NotMoreExamples {

	public static void main(String[] args) {
		
		boolean isJavaEasy=false;
		
		if(!isJavaEasy) {
			System.out.println("Please try to spend more time with Java");
		}
		
		System.out.println("--------------------------------------------");
		
		String day="Saturday";//by changing the day the result will change
		
		if(!day.equals("Sunday")) {
			System.out.println("I am going to work");
		}
		
		System.out.println("--------------------------------------------");
		
		
		if(!(day.equals("Sunday") || day.equals("Saturday"))) { // if we remove the "(" after ! and from the end, the Sunday will come out True.
			System.out.println("I am going to work");
		}
		System.out.println("---------------------------------------------");
		
		if(!(day.equals("Sunday") || day.equals("Saturday"))) { 
			System.out.println("I am going to work");
		
	}
	}

}
