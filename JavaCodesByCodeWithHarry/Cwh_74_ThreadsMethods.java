package com.company;
class Thread1 extends Thread{
    public void run(){
        int i = 0;
        while (i<24){
            System.out.println("Hello...");
            try {
                Thread.sleep(555);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        int i = 0;
        while (i<24){
            System.out.println("Good Morning...");
            i++;
        }
    }
}
public class Cwh_74_ThreadsMethods {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
