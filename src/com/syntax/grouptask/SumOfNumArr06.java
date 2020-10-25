package com.syntax.grouptask;

public class SumOfNumArr06 {

	public static void main(String[] args) {
		// Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.

		// TODO Auto-generated method stub
		 int [] [] sumNumber = {
                {100,88,74},
                {99,120,45},
                {88,33,1000},
                };
                sumRowsCols(sumNumber);
       }
       public static void sumRowsCols(int[][] row) {
                int sum = 0;
                for (int i = 0; i < row.length; i++) {
                         for (int j = 0; j < row[i].length; j++)
                                  sum = sum + row[i][j];
                }
                System.out.println("The sum of all numbers is " + sum);
	}
}
