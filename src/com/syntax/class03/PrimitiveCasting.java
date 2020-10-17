package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=12/7;//if we make it double (12.0/7.0), the result will be accurate
		System.out.println(d);
		
		double e=9;//widening
		System.out.println(e);
		
		//int num=9.89; error// doesn't work so we narrow it as following:
		
		int i=(int)9.99;//narrowing (9)
		System.out.println(i);
		
		byte b=(byte)130;//narrowing (whatever value...)
		System.out.println(b);
		

	}

}
