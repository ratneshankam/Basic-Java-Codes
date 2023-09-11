package com.company;
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){                                            // Important
        greet();
        System.out.println("Recording in 4k...");
    };
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling..." + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
//    public void takeSnap(){
//        System.out.println("Taking snap");
//    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2,MyWifi2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }
    //    public void record4KVideo(){                                              // Try to Run
//        System.out.println("Taking snap and Recording in 4k in MySmartPhone...");
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Harry", "Ratnesh", "Sakshi"};
        return networkList;
    };

    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    };
    public void sampleMeth(){
        System.out.println("meth");
    }
}

public class Cwh_59_Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();   // This is a smartPhone but use it as a camera.......because reference is camera
//        cam1.getNetworks();       // --> Not allowed for your good
//        cam1.sampleMeth();        // --> Not allowed for your good
        cam1.record4KVideo();
        MySmartPhone2 msp2 = new MySmartPhone2();
        msp2.getNetworks();
        msp2.sampleMeth();
    }
}
