package com.company;
import java.util.Scanner;
public class Cwh_16_Conditionals {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your age: ");
        int age = sc.nextInt();
//        if(age>100 || age<1){
//            System.out.println("Are you kidding? Try another input");
//        }
//        else if(age>=18)
//        {
//            System.out.println("You can drive!");
//
//        }
//        else{
//            System.out.println("You cannot drive!");
//        }

//        switch(age){
//            case 18:
//                System.out.println("You are going to be adult now!");
//                break;
//            case 60:
//                System.out.println("You are going to be retired now!");
//                break;
//            default:
//                System.out.println("Enjoy your life!");
//        }
        // Enhanced Switch case
        switch (age) {
            case 18 -> System.out.println("You are going to be adult now!");
            case 60 -> System.out.println("You are going to be retired now!");
            default -> System.out.println("Enjoy your life!");
        }
//        System.out.println("Thanks for using our java Program!");

    }
}
