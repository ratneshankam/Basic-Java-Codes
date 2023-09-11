package com.company;

public class Cwh_29_PracSetArray {
    public static void main(String[] args){
        // Problem 1
//        float [] marks = {45.6f, 67.7f, 88.3f, 78.5f, 99.5f};
//        int sum = 0;
//        for (int i = 0; i<marks.length; i++){
//            sum += marks[i];
//        }
//        System.out.println("The sum of array element is: " + sum);

        // Problem 2
//        float [] marks = {45.6f, 67.7f, 88.3f, 78.5f, 99.5f};
//        float ele = 88.3f;
//        boolean isArrayPresent = false;
//        for (int i = 0; i<marks.length; i++){
//            if (ele == marks[i]){
//                isArrayPresent = true;
//                break;
//            }
//        }
//        if(isArrayPresent) {
//            System.out.println("The given array element is present in the array");
//        }
//        else{
//            System.out.println("The element is not present in the array");
//        }

        // Problem 3
//        float [] marks = {45.6f, 67.7f, 88.3f, 78.5f, 99.5f};
//        int sum = 0;
//        for (int i = 0; i<marks.length; i++){
//            sum += marks[i];
//        }
//        System.out.println("The average of array elements is: " + sum/marks.length);

        // Problem 4
        int [][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int [][] mat2 = {{11, 12, 13},
                        {14, 15, 16}};
        int [][] result = {{0, 0, 0},
                          {0, 0, 0}};

        /*for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1[i].length; j++){
                //System.out.printf("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat1[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }*/

//        for (int i = 0; i<mat1.length; i++){
//            for (int j = 0; j<mat1[i].length; j++){
//                System.out.printf("Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat1[i][j];
//            }
//        }
//        for (int i = 0; i<mat1.length; i++){    // row number of times
//            for (int j = 0; j<mat1[i].length; j++){ // column number of times
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println();
//        }

        // Problem 5
//        int [] arr = {34, 56, 8, 4, 32};
//        int l = arr.length;
//        int temp;
//        int halfArr = Math.floorDiv(arr.length, 2);                   //Imp
//        for (int i = 0; i<halfArr; i++){
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//        for (int i = 0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//         Problem 6/7
//        int [] arr = {54,6,87,2,4,77};
////        int max = 0;
//        int max = Integer.MIN_VALUE;                                    //Imp
//        for (int i = 0; i<arr.length; i++){
//            if (arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println("The value of the maximum element in this array is: " + max);
//        int [] arr1 = {54,6,87,2,4,77};
//        int min = Integer.MAX_VALUE;                                    //Imp
//        for (int i = 0; i<arr1.length; i++){
//            if (arr1[i]<min){
//                min = arr1[i];
//            }
//        }
//        System.out.println("The value of the maximum element in this array is: " + min);

        // Problem 8
//        int [] arr = {54,6,87,2,4,77};
//        boolean isSorted = true;
//        for (int i = 0; i<arr.length - 1; i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        System.out.println(isSorted);
//        if (isSorted){
//            System.out.println("Array is sorted");
//        }else {
//            System.out.println("Array is not sorted");
//        }
    }
}
