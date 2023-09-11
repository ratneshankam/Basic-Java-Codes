package com.company;
class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<24){
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    MyNewThr2(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<24) {
            System.out.println("Thank You!" + this.getName());
            i++;
        }
    }
}
public class Cwh_73_ThreadPriorities {
    public static void main(String[] args) {
        MyNewThr1 t = new MyNewThr1();
        MyNewThr2 th = new MyNewThr2( "harry");
        t.setPriority(Thread.MAX_PRIORITY);
        th.setPriority(Thread.MIN_PRIORITY);
        t.start();
        th.start();
    }
}
