package com.company;

public class Cwh_30_Intel {
     int logic(int x, int y){
        int z;
        if (x>y){
            z = x + y;
        }else{
            z = x + y *5;
        }
        return z;
    }
    public static void main(String[] args) {
        System.out.println("Hello, Friends starting with new font and style");
        int a = 2;
        int b = 1;
//        int c = logic(a,b);
        Cwh_30_Intel obj = new Cwh_30_Intel();
        int c = obj.logic(a,b);
        System.out.println(c);
        int a1 = 5, b1 = 7;
//        int l = logic(a1,b1);
        int l = obj.logic(a1,b1);
        System.out.println(l);
    }
}
