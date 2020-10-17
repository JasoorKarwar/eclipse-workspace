package com.syntax.review;

public class NestedIfCondition {

	public static void main(String[] args) {

		String name = "Asghar";
		String pass = "pass123";
		double accountBalance = 10.25;
		double transferAmount = 8;
		boolean transAllowed = true;
		if (pass.equals("pass123")) {
			System.out.println("Welcom to Syntax bank" + name);
			if (transAllowed) {
				System.out.println("Initiating transfer");
				if (transferAmount > accountBalance) {
					System.out.println("Insufficient balance");
				} else {
					System.out.println("trunsfer complete");
					System.out.println("you are not allowed to transfer");
				}

			} else {
				System.out.println("Invalid credentials please try again");
			}
		}
	}
}
