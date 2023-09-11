package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
//        return super.toString() + "I am toString()";
        return "I am toString()";
    }

    @Override
    public String getMessage(){
//        return super.getMessage() + "I am getMessage()";
        return "I am getMessage()";
    }
}
public class Cwh_83_ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        a = sc.nextInt();
        if (a<9){
            try{
//                throw new MyException();                                  // -> Custom exception is throwing
                throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
//                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");

        }
        System.out.println("End of the program");
    }
}