package com.samplepage.Relevel.OOPS;

class isClass{
    int thisVar;
    isClass (int thisVar){
        this.thisVar=thisVar;
    }
    // Constructor overloading Example
    isClass(){
       this.thisVar=100;
    }


}
public class ConstructorOverloading {
    public static void main(String[] args) {
        isClass is = new isClass(12);
        isClass is2 = new isClass();
        System.out.println(is.thisVar); //12
      System.out.println(is2.thisVar); //100
    }
}
