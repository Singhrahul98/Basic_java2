package com.samplepage.Relevel.OOPS;

class Sawaree {
    private int milage;
    private int speed;

    Sawaree (int m, int s){
        // Called Private Classes Function
        speed = s;
        milage = m;
    }

    Sawaree (Sawaree s){// This Function is Copy Constructor Function
        speed = s.speed;
        milage = s.milage;
    }

    public int getMilage(){
        return milage;
    }

    public int getSpeed(){
        return speed;
    }
}


public class ConstructorParameterCopy {
    public static void main(String[] args){
        Sawaree Tata = new Sawaree(10,100); // milage = 10, speed = 100
        Sawaree Tata2=new Sawaree(Tata);
        Sawaree Tata3=new Sawaree(Tata);

        System.out.println(Tata.getMilage());
        System.out.println(Tata.getSpeed());
        System.out.println(Tata2.getSpeed());
        System.out.println(Tata3.getMilage());
    }
}
