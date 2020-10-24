package com.syntax.class10;

public class Class09LoopsRecap {

	public static void main(String[] args) {
		
		boolean condition=true;
		
		while(condition) {
			
			System.out.println("I am while loop");
			
			for(int i=1; i<8; i++) {
				System.out.println("I am for loop");
				break;
			}
		}

	}

}
