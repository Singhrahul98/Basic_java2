package com.samplepage.Relevel.AnjaliJava.AnjaliCollection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patterFound {
    public static void main(String[] args) {
        //Create a pattern to search
        Pattern pat = Pattern.compile("Hel");

        //Create a word
        //If Condition Statement
        String word1 = "Hello World";

        //While Loop Condition Statment
         String word = "Hello World Hello EveryOne";

        //Search above in the word
        Matcher m = pat.matcher(word);

        /** //Find the Pattern
         if (m.find()){
         System.out.println("Start index: "+ m.start());
         System.out.println("End index: "+ m.end());
         }
         else {
         System.out.println("Pattern  not found");
         }
         */

        //Find Pattern using While Loop
        while (m.find()){
            System.out.println("Start Index: "+ m.start());
            System.out.println("Ending Point: "+ m.end());
        }
    }
    }

