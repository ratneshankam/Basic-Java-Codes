/*      Exercise 6: You have to create a custom calculator with following operations:
        1. -> Addition
        2. -> Subtraction
        3. -> Multiplication
        4. -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 8 9
        2. Cannot divide by 0 Exception
        3. Max input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
package com.company;

import java.util.Scanner;

class MaxInput extends Exception{
    @Override
    public String toString(){
        return "Max Input Exception: Please enter input within 0 to 100000";
    }
    @Override
    public String getMessage(){
        return "Max Input Reached Multiplier Exception: Please enter input for multiplication is within 0 to 7000";
    }
}
class InvalidInput extends Exception{
    @Override
    public String toString(){
        return "Invalid Input Exception: Please enter valid number";
    }
    @Override
    public String getMessage(){
        return "Max Input Reached Multiplier Exception: Please enter input for multiplication is within 0 to 7000";
    }
}

public class Cwh_87_CustomCalculator {
    public static void Addition() throws MaxInput{
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("To Perform Addition; Please enter two numbers: ");
            double a = sc.nextInt();
            double b = sc.nextInt();
            if (a>100000 || b>100000){
                throw new MaxInput();
            }
            else if(a< -100000 || b< -100000){
                throw new InvalidInput();
            }
            else{
                System.out.println(a - b);
            }
        }
        catch (Exception e){
            System.out.println("Error! " + e.toString());
        }
    }
    public static void Subtraction() throws MaxInput{
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("To Perform Subtraction; Please enter two numbers: ");
            double a = sc.nextInt();
            double b = sc.nextInt();
            if (a>100000 || b>100000){
                throw new MaxInput();
            }
            else if(a< -100000 || b< -100000){
                throw new InvalidInput();
            }
            else{
                System.out.println(a - b);
            }
        }
        catch (Exception e){
            System.out.println("Error!");
        }
    }
    public static void Multiplication() throws MaxInput{
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("To Perform Multiplication; Please enter two numbers: ");
            double a = sc.nextInt();
            double b = sc.nextInt();
            if (a>7000 || b>7000){
                throw new MaxInput();
            }
            else if(a< -100000 || b< -100000){
                throw new InvalidInput();
            }
            else{
                System.out.println(a - b);
            }
        }
        catch (Exception e){
            System.out.println("Error!");
        }
    }
    public static void Division() throws MaxInput{
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("To Perform Division; Please enter two numbers: ");
            double a = sc.nextInt();
            double b = sc.nextInt();
            if (a>100000 || b>100000){
                throw new MaxInput();
            }
            else if(a< -100000 || b< -100000){
                throw new InvalidInput();
            }
            else{
                System.out.println(a - b);
            }
        }
        catch (Exception e){
            System.out.println("Error!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        try{
        while (flag) {
            System.out.println("To use calculator(y/n): ");
            String run = sc.next();
            if (run.equalsIgnoreCase("y")) {
                System.out.println("Enter choice: 1.For Addition 2.For Subtraction 3.For Multiplication 4.Division");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1 -> Addition();
                    case 2 -> Subtraction();
                    case 3 -> Multiplication();
                    case 4 -> Division();
                    default -> System.out.println("Invalid Input!");
                }
            } else {
                System.out.println("Thanks for using Calculator!");
                flag = false;
            }
                    }
        }catch(Exception c){
            System.out.println("error");
        }
    }
}
