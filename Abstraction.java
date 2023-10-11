package com.samplepage.Relevel.OOPS;

 abstract class Operation {
     abstract int sum (int a, int b);
 }

 class cal extends Operation {
     int sum (int a, int b){
         return a+b;
     }
 }

public class Abstraction {
    public static void main(String[] args) {
        cal c = new cal();
        int rs = c.sum(5,6);
        System.out.println(rs);
    }
}
