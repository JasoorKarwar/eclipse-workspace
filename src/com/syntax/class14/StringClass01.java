package com.syntax.class14;

public class StringClass01 {
    public static void main(String[] args){
        String name="Qasim";
        System.out.println(name.length());
        name="";
        System.out.println(name.length());
        name="Ahmed Qasim";
        System.out.println(name.length());
        name="   Qasim    ";
        System.out.println(name.length());

        if (name.length()>10){
            System.out.println("you are great");
        }
    }
}
