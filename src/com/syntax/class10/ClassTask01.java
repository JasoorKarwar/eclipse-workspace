package com.syntax.class10;

public class ClassTask01 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F.
		//Then print a grade B (use 2 different ways of creating an array).
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[4]='F';
		
		System.out.println(grades[2]);
		
		System.out.println("--------------Another Way---------------");
		
		char[] grades1= {'A', 'B' ,'C', 'D', 'E','F'};
		System.out.println(grades1[3]);
		
		// Create an array of names and store all names of your group. Then print your 
		//name from that array. (use 2 different ways of creating an array).
		
		String[] names=new String[6];
		names[0]="Ebrar";
		names[1]="Jasoor";
		names[2]="Mike";
		names[3]="Qsim";
		names[4]="Burju";
		names[5]="Mahmut";
		
		System.out.println(names[1]);
		
		System.out.println("--------------Another Way---------------");
		
		String[] names1= {"Ebrar", "Jasoor", "Mike", "Qsim", "Burju", "Mahmut"};
		System.out.println(names1[1]);
		
		System.out.println("--------------------------------------------------");
		
		// Create an array of words: Java, Saturday, day, coding, is. Print the following 
		//sentence using elements of array: “Saturday is Java coding Day”.
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="Coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		

		

	}

}
