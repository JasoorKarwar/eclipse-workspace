package com.syntax.class20;

public class ClassT1 {

    /* Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
    */

    String name;
    String address;
    ClassT1 (String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
    public static void main(String[] args) {
        ClassT1 st1 = new ClassT1("Bob","Virgina");
        st1.displayInfo();
        ClassT1 st2 = new ClassT1("Tom","California");
        st2.displayInfo();
    }

}
