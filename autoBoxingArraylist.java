package com.samplepage.Relevel.AnjaliJava.AnjaliCollection;

import java.util.ArrayList;

public class autoBoxingArraylist {
    public static void updateIntValue (int value){
        value = value+100;
        System.out.println("Inside Function call: "+value);
    }

    public static void updateArrayListValue (ArrayList<Integer> arrayList){
        //This will update to arraylist at index 0 to 200
        arrayList.set(0,200);

        //This will updaet to arralist at index 1,to 500
        arrayList.set(1,500);

        System.out.println("Value inside function call: "+arrayList);
    }

    public static void main(String[] args) {
        int a = 6;
        System.out.println("Before function call: "+a);

        updateIntValue(a);
        System.out.println("After function call: "+a);

        ArrayList<Integer>arrayList = new ArrayList<>();
        //Premitive data type to object
        Integer b = a;

        //Add value to arrayList
        arrayList.add(b);
        arrayList.add(10);

        System.out.println();
        System.out.println("Before Function Call: "+arrayList);

        updateArrayListValue(arrayList);
        System.out.println("After Function call: "+arrayList);
    }
}
