package com.syntax.grouptask;

public class PrimeNumber02 {

	public static void main(String[] args) {

		int i, k = 0, num = 0;
		int j = 13;
		k=j/2;
		
		if(j==0||j==1)
		{
			System.out.println(j + " is not a prime number.");
		} else {
			for (i = 2; i <= k; i++) {
				if (j % i == 0) {
					System.out.println(j + " is not a prime number.");
					num = 1;
					break;
				}
			}
			if (num == 0) {
				System.out.println(j + " is a prime number.");
			}
		}
	}
}