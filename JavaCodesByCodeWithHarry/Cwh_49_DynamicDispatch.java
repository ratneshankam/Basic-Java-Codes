package com.company;
class phone{
    public void showTime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("Playing music...!");
    }
    public void on(){
        System.out.println("Turning on smartphone...");
    }
}
public class Cwh_49_DynamicDispatch {
    public static void main(String[] args) {
//        phone obj = new phone();
//        smartphone smobj = new smartphone();
//        smobj.on();

        phone ob = new smartphone();    // allowed
//        smartphone ob1 = new phone();    // Not allowed
        ob.showTime();
        ob.on();
//        ob.music();   // Not allowed because we are referencing using another class
    }
}