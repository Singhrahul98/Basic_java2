package com.samplepage.Relevel.AnjaliJava.AnjaliCollection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checheckRegex {
    public static void searchPatterCase(Pattern pat , String word){
        Matcher matcher = pat.matcher(word);
        if (matcher.find()){
            System.out.println("Starting Index: "+matcher.start() + " Ending Index " + matcher.end());
        }else {
            System.out.println("Match not Found");
        }
    }

    public static void main(String[] args) {
        //Creating Word
        String word1 = "hellooo";
        String word2 = "HELLO";
        String word3 = "hellloooo";
        String word4 = "HELLOOOOO";

        //Creating a pattern 1
        Pattern pattern1 = Pattern.compile("hello");
        searchPatterCase(pattern1, word1);
        searchPatterCase(pattern1, word2);
        searchPatterCase(pattern1, word3);
        searchPatterCase(pattern1, word4);

        System.out.println();

        //Creating Pattern 2
        Pattern pattern2 = Pattern.compile("HELLO");
        searchPatterCase(pattern2,word1);
        searchPatterCase(pattern2, word2);
        searchPatterCase(pattern2, word3);
        searchPatterCase(pattern2, word4);
    }
}
