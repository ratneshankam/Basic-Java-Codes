package com.company;
class MyRunnableInterface1 implements Runnable{
    public void run(){
        for (int i = 0; i< 100; i++){
            System.out.println("I am a Thread not threat");
        }
    }
}
class MyRunnableInterface2 implements Runnable{
    public void run(){
        for (int i = 0; i< 100; i++){
            System.out.println("I am a Thread 2 not threat 2");
        }
    }
}
public class Cwh_71_RunnableInterface {
    public static void main(String[] args) {
        MyRunnableInterface1 bullet1 = new MyRunnableInterface1();
        Thread gun1 = new Thread(bullet1);
        MyRunnableInterface2 bullet2 = new MyRunnableInterface2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
