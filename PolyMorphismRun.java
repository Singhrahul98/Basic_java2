package com.samplepage.Relevel.OOPS;


class veichle {
    // Polymorphism RunTime (Function Overriding)
       int engine =1;
       boolean isTransport = true;

       void Running (){
           System.out.println("I Am Veichle");
       }
     }

     class Car extends veichle {
        int wheel = 4;
        void Running (){
            System.out.println("I Am Car");
        }
     }

     class Bike extends veichle{
        int wheel = 2;
     }

public class PolyMorphismRun {
    public static void main(String[] args) {
        veichle vc = new veichle();
        Car cr = new Car();

        vc.Running();
        cr.Running();
    }

}
