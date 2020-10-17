package com.jasoor.homework;

import java.util.Scanner;

public class LogicalOperators_37 {

	public static void main(String[] args) {

		boolean thirsty;
		boolean sleepy;
		String drink = null;

		Scanner scan = new Scanner(System.in);

		System.out.println("Are you Thirsty?");
		sleepy = scan.nextBoolean();
		System.out.println("Are you sleepy?");
		thirsty = scan.nextBoolean();

		if (thirsty==true && sleepy!=false) {
			drink = "Water";
		} else if (thirsty==true && sleepy==true) {
			drink = "Coffee";
		} else if (thirsty==false && sleepy==false) {
			drink = "Tea";
			System.out.println("Looks like you need to drink" + " " + drink);
		} else {
			System.out.println(drink + " " + "Nothing");
		}
	}
}
