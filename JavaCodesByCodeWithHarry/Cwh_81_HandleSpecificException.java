package com.company;

import java.util.Scanner;

public class Cwh_81_HandleSpecificException {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 23;
        marks[1] = 243;
        marks[2] = 523;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value at array-value/number is: " + marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }

    }
}
