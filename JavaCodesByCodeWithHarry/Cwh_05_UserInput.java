package com.company;
        import java.util.Scanner;
                public class Cwh_05_UserInput {
    public static void main(String[] args){
        System.out.println("Printing sum operation");
        System.out.print("Enter the numbers to add: ");
        Scanner s = new Scanner(System.in);
        float a = s.nextInt();
        float b = s.nextInt();
        boolean str = s.hasNextInt();
        System.out.println("The sum of two number is "+ (a+b));
        System.out.println(str);

    }
                }