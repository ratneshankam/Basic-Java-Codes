package com.company;
// Problem 1 and 2
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing through Pen..");
    }
    public void refill(){
        System.out.println("Refilling Pen...");
    }
    public void ChangeNib(){
        System.out.println("Changing the Nib...");
    }
}
// Problem 3
class Monkey{
    void Jump(){
        System.out.println("Monkey Jumping...");
    }
    void Bite(){
        System.out.println("Monkey Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir!");
    }
    public void eat(){
        System.out.println("It's eating time...");
    }
    public void sleep(){
        System.out.println("It's sleeping time...");
    }
}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Telephone ringing...");
    }
    public void lift(){
        System.out.println("Lifting Telephone...");
    }
    public void disconnect(){
        System.out.println("Disconnecting...");
    }
    void tele(){
        System.out.println("Inside SmartTelephone");
    }
}
interface TVRemote{
    void on();
    void off();
}
interface SmartTVRemote extends TVRemote{
    void touch();
}
class TV implements SmartTVRemote{
    public void on(){
        System.out.println("Switching on...");
    }
    public void off(){
        System.out.println("Switching off...");
    }
    public void touch(){
        System.out.println("Switching off...");
    }
}
public class Cwh_60_interfaceInheritance_PracSet {
    public static void main(String[] args) {
        // Problem 1 and 2
        FountainPen p = new FountainPen();
        p.ChangeNib();
        p.refill();
        // Problem 3
        Human h = new Human();
        h.sleep();
        // Problem 4
        Telephone sm = new SmartTelephone();
        //sm.tele();            //......Throws and error
        sm.ring();
        // Problem 5
        Monkey m = new Human();
        //m.speak();            // --> Cannot use speak method because the reference is monkey which does not have [speak] method
        m.Jump();
        // Problem 6 and 7
        SmartTVRemote sony = new TV();
        sony.on();
    }
}
