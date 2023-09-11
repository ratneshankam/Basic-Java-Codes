package com.company;

class MyThr1 extends Thread{
    MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
//        while(i<24){
//            System.out.println("Good Morning!");
//            i++;
//        }
    }
}
class MyThr2 extends Thread{
    MyThr2(String name){
        super(name);
    }
    public void run(){
        int i = 0;
//        while(i<24) {
//            System.out.println("Thank You!");
//            i++;
//        }
    }
}
class MyThr3 implements Runnable{
    MyThr3(Runnable r, String name){

    }
    public void run(){
        int i = 0;
//        while(i<24){
//            System.out.println("Hello...");
//            i++;
//        }
    }
}
public class Cwh_72_ThreadConstructor {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr2 t2 = new MyThr2("Harry2");
        t1.start();
        t2.start();
        System.out.println("Thread 1 id: " + t1.getId());
        System.out.println("Thread 1 name: " + t1.getName());
        System.out.println("Thread 2 id: " + t2.getId());
        System.out.println("Thread 2 name: " + t2.getName());
        MyThr3 t3 = new MyThr3(t1,"ram");
        Thread t = new Thread(t3);
        t.start();
        System.out.println("Thread using Runnable the id: " + t.getId());
        System.out.println("Thread using Runnable the name: " + t.getName());
    }
}
