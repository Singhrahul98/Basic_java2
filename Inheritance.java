package com.samplepage.Relevel.OOPS;


    class Veichle {
        // Parent Class
        int engine = 1;
        boolean isTransport = true;
    }

    class car extends Veichle {
        int wheel = 4;
    }

    class bike extends Veichle{
        int wheel = 2;
        boolean hasRoof = false;
    }
    // Multilevel Inheritance Classes

    class scuty extends bike{
        boolean autoStart = true;

    }

    public class Inheritance{

        public static void main (String[] args){
             car bmw = new car();
             bike honda = new bike();
             scuty activa = new scuty();

             System.out.println(bmw.engine);
             System.out.println(bmw.wheel);
             System.out.println(bmw.isTransport);
             System.out.println(honda.wheel);
             System.out.println(activa.hasRoof);
             System.out.println(activa.autoStart);
            System.out.println(activa.wheel);
        }

}
