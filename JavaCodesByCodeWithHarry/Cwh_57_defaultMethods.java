package com.company;

import java.util.Arrays;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){                                            // Important
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
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
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
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
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }

}
public class Cwh_57_defaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
//        ms.greet();                   // --> Throws an error
        String[] ar = ms.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
