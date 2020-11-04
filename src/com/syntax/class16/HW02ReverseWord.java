package com.syntax.class16;

import java.util.Arrays;

public class HW02ReverseWord {
    public static void main(String[]args) {

        String sentence = "What did u use the most";
        String[] stringArray = sentence.split(" ");
        System.out.println(Arrays.toString(stringArray));

        int i;
        for (i = 0; i < stringArray.length; i++) {

            StringBuilder stringBuilder = new StringBuilder(stringArray[i]);
            System.out.println(stringBuilder);
            stringArray[i] = stringBuilder.reverse().toString();
            System.out.println(i);
        }
        System.out.println(Arrays.toString(stringArray));
  
    }

}
