package com.company;
class a{};
class b{};
//class c extends a,b{};            // ... error
interface Bicycle{
    int a = 34;                     // try with final keyword because fields are constants by defaults
    void applyBrake(int decrement); // try with public keyword because methods are public by defaults
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}
// without implementing HornBicycle you still can define its methods but if you're implementing interfaces then it is needs to define their methods.
class AvonCycle implements Bicycle, HornBicycle{
//    public int a = 235;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    // Methods should be publicly declared
    public void applyBrake(int decrement){
        System.out.println("Applying break");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK3g(){
        System.out.println("kabhi Khushi Kabhi gum pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon na po po po");
    }
}

public class Cwh_54_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        // You cannot modify the properties in Interfaces as they are constants but can be possible with overrides ^lookUp
//        cycleHarry.a = 334;        // ...error
//        cycleHarry.blowHornK3g();
//        cycleHarry.blowHornmhn();
    }
}
