package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		int num1=1800;
		int num2=900;
		
		System.out.println("writing my first if statement");
		
		if(num1>num2) {
			System.out.println("num1 is bigger then num2");	
		}
		
		System.out.println("End of if statment");
		
		
		System.out.println("---------------------------------------------------------");
		
		int temp=60;
		
		if(temp>=60){
			System.out.println("I am going to the beach");
		}else {
			System.out.println("I will go for a walk");
		}
		
		System.out.println("---------------------------");
		
		double expectedHours=20;
		double actualHours=8;
		
		if(actualHours>expectedHours) {//true the following will be executed
			System.out.println("You will love the cours and you will succeed");
		}else {//false the following will be executed
			System.out.println("course will be to hard for you!");
			
		}

	}

}
