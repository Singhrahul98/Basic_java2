package com.samplepage.Relevel.OOPS;

public class MyException {

        // Try and Catch Exception
     /*  try {
            int[] arr = new int[3];
            arr[7] = 12;
        }catch(Exception e){
           System.out.println("some error occured");
        }

        try{
            int [] arr = new int[3];
            arr[9] = 12;
            int a = 10/0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Error");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Error");
        }

      */


      // Throws Keyword
    static int divsion (int a, int b)throws ArithmeticException {
        int rs = a/b;
        return rs;
    }

    // Throw Keyword
    static void checkAge (int age) throws Exception {
        if (age<18){
            throw new Exception("my custom exception");
        }
    }
      public static void main(String[] args){
        //Throws
     //   try{
     //       divsion(10,0);
     //   }catch(ArithmeticException e){
     //       System.out.println("Exception Error");
     //   }

          // throw
        try {
            checkAge(1);
        }catch(Exception e){
            System.out.println("Age is under 18");
        }
        finally {
            System.out.println("Code Is Ended");
        }
    }
}
