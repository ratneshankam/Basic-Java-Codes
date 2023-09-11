package com.company;
import java.util.Scanner;
public class Cwh_19_PracSet4 {
    public static void main(String[] args){

//        Problem 1
//        int age = 10;
//        if (age = 10) {
//            System.out.println("I am 10");
//        }
//        else{
//            System.out.println("I am not 10");
//        }

//        Problem 2
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your PHYSICS marks out of 100: ");
//        float m1 = sc.nextFloat();
//        System.out.print("Enter your CHEMISTRY marks out of 100: ");
//        float m2 = sc.nextFloat();
//        System.out.print("Enter your MATHEMATICS marks out of 100: ");
//        float m3 = sc.nextFloat();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.print("Your Percentage is: ");
//        System.out.println(avg);
//        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
//            System.out.println("Congratulations! You are Promoted!");
//        }else{
//            System.out.println("Sorry, You aren't Promoted! Try again next time!");
//        }

//        Problem 3
//        float tax = 0f;
//        System.out.print("Enter your taxable income as per annum: ");
//        float income = sc.nextFloat();
//        if (income <= 2.5){
//            tax += 0;
//        }else if (income > 2.5 && income <= 5.0){
//            tax += (income - 2.5)*0.05f;
//        }else if (income > 5f && income <= 10f){
//            tax += (5f - 2.5)*0.05f;
//            tax += (income - 5f)*0.2f;
//
//        }else if (income > 10f){
//            tax += (5f - 2.5)*0.05f;
//            tax += (10f - 5f)*0.2f;
//            tax += (income - 10f)*0.3f;
//
//        }
//        System.out.println("Your tax as per entered income: " + tax);

//        Problem 4
//        System.out.format("Enter the number: ");
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Try with another input!");
//        }

//        Problem 5
        System.out.format("Enter the Year: ");
        int year = sc.nextInt();
        if (year%100 == 0){
            if (year%4 == 0 && year%400 == 0){
                System.out.println(year + " is a Leap Year!");}
            else{
                System.out.println(year + " is not a Leap Year!");
            }
            }
        else if (year%4 == 0)
        {
            System.out.println(year + " is a Leap Year!");
        }else{
                System.out.println(year + " is not a Leap Year!");
            }
                                // OR
//        System.out.format("Enter the Year: ");
//        int year = sc.nextInt();
//        if (year%100 == 0 && year%4 == 0 && year%400 == 0){
//            System.out.println(year + " is a Leap Year!");}
//        else if (year%4 == 0) {
//            System.out.println(year + " is a Leap Year!");
//        }else{
//            System.out.println(year + " is not a Leap Year!");
//        }


//        Problem 6
//        System.out.format("Enter your website: ");
//        String web = sc.next();
//        if (web.endsWith(".com")){
//            System.out.println("Your website is commercial");
//        }else if (web.endsWith(".org")){
//            System.out.println("Your website is organisation");
//        }else if (web.endsWith(".in")){
//            System.out.println("Your website is indian");
//        }
    }
}
