package com.samplepage.Relevel.AnjaliJava.AnjaliCollection;

import java.util.regex.Pattern;

public class patternQuantifiers {
    public static void main(String[] args) {
        //Single Character only Or Full Character
        System.out.println(Pattern.matches("[text]", "text" ));
        System.out.println(Pattern.matches("[txt]", "t"));
        System.out.println(Pattern.matches("[text]", "e"));
        System.out.println();

        //? ==> Anyone Character Are in there atmost one
        System.out.println(Pattern.matches("[aabbcc]?", "c"));
        System.out.println(Pattern.matches("[aabbcc]?", "b"));
        System.out.println(Pattern.matches("[aabbcc]?", "abb"));
        System.out.println();

        //+ ==> Any Character CAn be there any number of times
        System.out.println(Pattern.matches("[aabbccss]+", "abcs"));
        System.out.println(Pattern.matches("[aabbccss]+", "bbbbcccs"));
        System.out.println(Pattern.matches("[aabbccss]+", "aabbm"));
        System.out.println();

        //* ==> Character repeat any number of times but Orders Only
        System.out.println(Pattern.matches("[amn]*","a"));
        System.out.println(Pattern.matches("[amn]*","ammmmnnnn"));
        System.out.println(Pattern.matches("[amn]*","nnnmmmv"));







    }
}
