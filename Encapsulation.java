package com.samplepage.Relevel.OOPS;


 class BD {
     private int legs = 2;
     private int wings = 2;

     public  void getWings (){
         System.out.println(wings);
     }
 }

public class Encapsulation {
     public static void main(String[] args){
         BD crow = new BD();
         crow.getWings();
     }

}
