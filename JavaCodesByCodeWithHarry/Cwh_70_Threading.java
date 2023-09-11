package com.company;
class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I am running MyThread class Thread");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I inside the MyThread2 class Thread");
            System.out.println("I am Sad");
            i++;
        }
    }
}
public class Cwh_70_Threading {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread2 t2 = new MyThread2();
        t.start();
        t2.start();
    }
}
