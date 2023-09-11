package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Cwh_91_arrayList {
    public static void main(String []args){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(2);
        l2.add(23);
        l2.add(23);
        l2.add(23);
        l2.add(23);
        l1.add(2);
        l1.add(21);
//        l1.add(0,22);
        l1.add(22);
        l1.add(21);
        l1.add(1);
        l1.addAll(l2);
//        l1.addAll(2,l2);
        System.out.println(l1.contains(2));
        System.out.println(l1.contains(8));
        System.out.println(l1.indexOf(1));          //Noted
        System.out.println(l1.indexOf(8));
//        l1.remove(1333);                    // generate error but didn't show
        for (int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println( );
        l1.remove(7);
        for (int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
