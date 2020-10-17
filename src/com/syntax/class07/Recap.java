package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {

		String timeOfDay="Morning";
		String day="Saturday";
		
		switch (timeOfDay){
		case "Morning":
			System.out.println("Good Morning");
			
			switch(day) {
			case"Monday":
				System.out.println("Colleague");
			    break;
			case "Thursdy":
				System.out.println("Asghar");
				break;
			case "Saturday":
				System.out.println("Class");
				break;
			}
		}

	}

}
