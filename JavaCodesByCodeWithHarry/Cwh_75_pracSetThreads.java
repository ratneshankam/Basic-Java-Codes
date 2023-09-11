package com.company;
class Greet1 extends Thread{
    public void run(){
//        while(true){
//            System.out.println("Good Morning");
////            try{
////                Thread.sleep(200);
////            }
////            catch(InterruptedException e){
////                System.out.println(e);
////            }
//        }
    }
}
class Greet2 extends Thread{
    public void run(){
//        while(true){
//            System.out.println("Welcome");
//        }
    }
}
public class Cwh_75_pracSetThreads {
    public static void main(String[] args) {
        Greet1 g1 = new Greet1();
        Greet2 g2 = new Greet2();
        //problem
        g1.setPriority(6);
        g2.setPriority(9);
        System.out.println(g1.getPriority());
        System.out.println(g2.getPriority());
        //problem
        System.out.println(g1.getState());
        g1.start();
        System.out.println(g1.getState());
        //problem
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        g2.start();
    }
}
