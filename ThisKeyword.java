package com.samplepage.Relevel.OOPS;

class thisClass{
    int thisvar;  //Class or Instance Variable


    // instance Variable hiding
    void printThisvar(){
        int thisvar = 15;  // Local Variable
        System.out.println(this.thisvar); // {When print instance(class) Variable }
        System.out.println(thisvar);  // { print Loacal Variable}
    }

    thisClass(int thisVar){
        this.thisvar=thisVar;
    //    System.out.println(this); {this keyword Example}
    }
}


public class ThisKeyword {
    public static void main(String[] args) {
        thisClass th = new thisClass(12);
       // thisClass th2 = new thisClass(13); {This Keyword Example}
        th.printThisvar();


    }
}

