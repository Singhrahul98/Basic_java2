package com.samplepage.Relevel.OOPS;

class Bird {
    int wings = 2;
    int legs = 2;
    boolean canFly = true;
}

 class mamels {
    int legs = 4;
    boolean canFly = false;

 }

public class ClassObject {
    public static void main(String[] args){
        Bird crow = new Bird();
        mamels tiger = new mamels();
        System.out.println(crow.canFly);
        System.out.println(crow.legs);
        System.out.println(crow.wings);
        System.out.println(tiger.legs);
        System.out.println(tiger.canFly);
    }

}
