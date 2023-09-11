package com.company;

public class Cwh_26_Arrays {
    public static void main(String[] args){
        //Type 1;
//        int [] marks = new int[5];
        //Type 2;
//        int []marks;
//        marks = new int[5];
        int [] marks ={42,5,6,7,8};
        float [] percentage = {5f,6.4f,5.6f,6.4234f};
        String [] names = {"Ratnesh", "Kiran", "Ankam"};
        marks[0] = 4;
        marks[1] = 42;
        marks[2] = 44;
        marks[3] = 435;
        marks[4] = 42;
        System.out.println(marks.length);
        System.out.println(percentage.length);
        System.out.println(names.length);
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        // Displaying the element in Reverse Traversal
//        for (int i = marks.length - 1; i>=0; i--){
//            System.out.println(marks[i]);
//        }
        // Enhanced For Loop
//        for(int ele: marks){
//            System.out.println(ele);
//        }
        }
    }

