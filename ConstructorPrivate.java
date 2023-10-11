package com.samplepage.Relevel.OOPS;

public class ConstructorPrivate {
    private int testValue;
    private ConstructorPrivate (int value){
        testValue=value;
    }

    int getvalue(){
        return testValue;
    }

    public static void main(String[] args){

        ConstructorPrivate tetsObjext = new ConstructorPrivate(12);
    }
}
