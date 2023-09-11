package com.company;
import java.util.Scanner;
public class Cwh_06_Ex1CbseClassPercentage {
    public static void main(String[]args){
        System.out.println("The cbse board student percentage");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks given out of: ");
        float x = s.nextFloat();
        System.out.println("Enter the subject 1 marks: ");
        float a = s.nextFloat();
        System.out.println("Enter the subject 2 marks: ");
        float b = s.nextFloat();
        System.out.println("Enter the subject 3 marks: ");
        float c = s.nextFloat();
        System.out.println("Enter the subject 4 marks: ");
        float d = s.nextFloat();
        System.out.println("Enter the subject 5 marks: ");
        float f = s.nextFloat();
        float y = ((a+b+c+d+f)/(5*x))*100;
        System.out.println("Your percentage is: " + y);

    }
}
