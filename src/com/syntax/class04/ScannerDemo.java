package com.syntax.class04;

//shortcut to import for Windows is ctrl+shift+o
//shortcut to import for mac is command+shift+o

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		int num=80;
		String str="I am a String";
		
		Scanner scan=new Scanner(System.in);//enables input to the console// System.in = We are taking in something from the Console   //System.out = We print something on the Console
        //I am adding some messages to the user
		System.out.println("Please enter any text");
		
		String value=scan.nextLine();// waits for your input and once you provided input --> hit ENTER button
        System.out.println("I captured String value = "+value);
        
        System.out.println("Please enter your name");
        String name=scan.nextLine();
        System.out.println("Nice to meet you "+name);
        
        
	}

}
