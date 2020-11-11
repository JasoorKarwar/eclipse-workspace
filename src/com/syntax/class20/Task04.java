package com.syntax.class20;


public class Task04 {

        String name;
        String address;


        Task04(String name, String address) {
            this.name = name;
            this.address = address;
        }

        void displayInfo() {
            System.out.print("name " + name);
            System.out.println(" Address" + address);
        }

        public static void main(String[] args) {
            Task04 studentA = new Task04("john", "123 Fairfax");
            studentA.displayInfo();
            Task04 studentB = new Task04("karim", "123 Algiers");
            studentB.displayInfo();
        }

    }

