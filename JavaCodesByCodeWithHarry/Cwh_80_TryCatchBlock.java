package com.company;

public class Cwh_80_TryCatchBlock {
    public static void main(String[] args) {
        int a = 32;
        int b = 0;
        // Without try block
//        int c = a/b;
//        System.out.println("The result is " + c);
        // With try block
        try{
            int c = a/b;
            System.out.println("The result is " + c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason: " + e);
        }
        System.out.println("End of the program");
    }
}
