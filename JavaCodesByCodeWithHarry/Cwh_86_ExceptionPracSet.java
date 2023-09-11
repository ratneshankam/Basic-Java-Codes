package com.company;
import java.util.Scanner;
class MaxLimit extends Exception{
    @Override
    public String toString(){
        return "Your max retries are reached...";
    }
}
public class Cwh_86_ExceptionPracSet {
    // Problem 5
    public static int arrIndexing() throws MaxLimit{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        arr[0] = 12;
        arr[1] = 142;
        arr[2] = 123;
        arr[3] = 122;
        arr[4] = 112;
        int i = 0;
        boolean flag = true;
        while (flag && i<5) {
            try {
                System.out.println("Enter the array index:");
                int ind = sc.nextInt();
                System.out.println("Your entered array index value is " + arr[ind]);
                flag = false;
            }
            catch(Exception e){
                    i++;
            }
            if( i>=5){
                //Problem 4
                try {
                    throw new MaxLimit();
                }
                catch (Exception e){
                    System.out.println("Inside catch block");
                }
                System.out.println("error");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
//        // Problem 3
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[6];
//        arr[0] = 12;
//        arr[1] = 142;
//        arr[2] = 123;
//        arr[3] = 122;
//        arr[4] = 112;
//        int i = 0;
//        boolean flag = true;
//        while (flag && i<5) {
//            try {
//                System.out.println("Enter the array index:");
//                int ind = sc.nextInt();
//                System.out.println("Your entered array index value is " + arr[ind]);
//                flag = false;
//            }
//            catch(Exception e){
//                    i++;
//            }
//            finally{
//                System.out.println("You are having max 5 retries you used " + i +" of them.");
//            }
//        }
//        if( i>=5){
//            //Problem 4
//            try {
//                throw new MaxLimit();
//            }
//            catch (Exception e){
//                System.out.println("Inside catch block");
//            }
//            System.out.println("error");
//        }
        //Problem 5
        try{
            int methodCall = arrIndexing();
            System.out.println(methodCall);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
