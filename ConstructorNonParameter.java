package com.samplepage.Relevel.OOPS;

class Bus {
    private int milage;
    private int speed;

    Bus (){
        System.out.println("Bus is getting a constructed");
    }
}

public class ConstructorNonParameter {

    public static void main(String[] args){
        Bus volvo = new Bus();
    }
}
