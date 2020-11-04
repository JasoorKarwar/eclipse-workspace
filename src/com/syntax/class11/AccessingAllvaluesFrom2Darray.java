package com.syntax.class11;

public class AccessingAllvaluesFrom2Darray {

	public static void main(String[] args) {

		// new char [how many rows] [how many columns];

		char[][] $array = new char[3][4];

		// add values to first row
		$array[0][0] = 'A';
		$array[0][1] = 'B';
		$array[0][2] = 'C';
		$array[0][3] = 'D';

		// add values to the second row
		$array[1][0] = 'W';
		$array[1][1] = 'X';
		$array[1][2] = 'Y';
		$array[1][3] = 'Z';

		// add values to the third row
		$array[2][0] = 'Q';
		$array[2][1] = 'W';
		$array[2][2] = 'B';
		$array[2][3] = 'R';

		System.out.println($array.length);

		for (int row = 0; row < $array.length; row++) { // loops through rows
			for (int col = 0; col < $array[row].length; col++) { // loops through columns
				System.out.print($array[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------");

		int[][] array= {
				{10, 20, 30},
				{1, 2, 3},
				{100, 200, 300},
		};
		for(int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.println(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
