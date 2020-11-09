package com.syntax.class19;

public class Constructors {

    int number;
    String name;
    char character;

    Constructors(){
        System.out.println("I will be called everytime you create an object of this class");
    }

    Constructors(int numberValue,String nameValue,char characterValue){
        System.out.println("I am not a useless constructor I am initializing your fields");
        number=numberValue;
        name=nameValue;
        character=characterValue;
    }

    void print(){
        System.out.println("Number "+number+" name "+name+"character "+character);
    }

    public static void main(String[] args) {
        Constructors constructors=new Constructors();
       /* Constructor constructor2=new Constructors(constructors.number, );*/


        // Constructors
        //(Constructors) name of the variable
        //(=) assignment
        // (new) we want an object


        //int num;
        //System.out.println();
    }

}
