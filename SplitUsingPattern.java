package com.samplepage.Relevel.AnjaliJava.AnjaliCollection;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitUsingPattern {
    public static void SplitUsingpattern(Pattern pattern, String text){
        String[] result = pattern.split(text);
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        String delimiter1 = "_";
        String text1 = "this_is_an_example_text";
        Pattern pattern1 = Pattern.compile(delimiter1);
        SplitUsingpattern(pattern1, text1);

        String delimeter2 = "s";
        String text2 = "This is an Examples of string text";
        Pattern pattern2 = Pattern.compile(delimeter2);
        SplitUsingpattern(pattern2, text2);

        String text3 = "ThisIsASampleString";
        Pattern pattern3 = Pattern.compile(delimeter2, Pattern.CASE_INSENSITIVE);
        SplitUsingpattern(pattern3, text3);
    }
}
