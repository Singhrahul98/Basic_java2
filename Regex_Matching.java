package com.samplepage.Relevel.AnjaliJava.AnjaliCollection;

import java.util.regex.Pattern;

public class Regex_Matching {
    public static void main(String[] args) {
        String regex = "ab*";

        String pattern1 = "ab";
        String pattern2 = "abb";
        String pattren3 = "aab";

        System.out.println(regex + " Matching in the pattern"+ pattern1 + " : " + Pattern.matches(regex, pattern1));
        System.out.println(regex + " MAtching in the pattern "+ pattern2 + " : "+ Pattern.matches(regex, pattern2));
        System.out.println(regex + "Matching in the pattren " + pattren3 + " : "+ Pattern.matches(regex, pattren3));
    }
}
