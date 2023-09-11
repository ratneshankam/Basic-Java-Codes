package com.company;
import java.util.Scanner;
public class Cwh_13_Strings {
    public static void main(String[] args) {
//         String name = new String("Ratnesh");
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        String name = sc.nextLine();
//        System.out.println(name);
        int a = 54;
        float b = 5.3f;
        System.out.printf("The value of a is %4d and the value of b is %6.2f", a, b);// Either use this or -->
        System.out.println();
        System.out.format("The value of a is %d and the value of b is %f ", a, b);

    }
}
