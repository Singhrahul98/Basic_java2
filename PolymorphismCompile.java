package com.samplepage.Relevel.OOPS;

public class PolymorphismCompile {
    // Compile Time Polymorphism(Function OverLoading)
    static double sum (int a, double b){
        return a+b;
    }

    static int sum (int a, int b, int c){
        return a+b+c;
    }

    public static void main (String[] args){
        double rs1 = sum(5, 6.7);
        int rs2 = sum(5,6,7);

        System.out.println(rs1);
        System.out.println(rs2);
    }
}
