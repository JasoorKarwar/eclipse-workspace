package com.syntax.class16;

public class HW01Review {
    public static void main(String[]args){

        String str1 = "Anna";
        String reverse= "";

        for (int i= str1.length()-1; i>0; i--){
            System.out.println(i);
            System.out.println(str1.charAt(i));
            reverse=reverse+str1.charAt(i);
            System.out.println(reverse);

        }
        System.out.println(reverse);
        System.out.println("is "+str1+" palindrome?"+reverse.equalsIgnoreCase(str1));
        // we can get the same output using StringBuilder as well
    }
}
