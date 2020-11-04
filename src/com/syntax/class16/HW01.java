package com.syntax.class16;

import java.util.Scanner;

public class HW01 {
     //Create a method createEmail(). Based on values of users name, lastName and  email type,
     //your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     public static void main(String[] args) {

         String userName, lastName, emailType;

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter your first name:");
         userName=scan.nextLine();
         System.out.println("Enter last name:");
         lastName=scan.nextLine();
         System.out.println("Enter your email type:");
         emailType=scan.nextLine();
         printEmail(userName, lastName, emailType);

     }
     private static void printEmail(String userName, String lastName, String emailType){
         System.out.println("Your email ID is:");
         System.out.println(userName+lastName+"@"+emailType+".com");

     }
}
