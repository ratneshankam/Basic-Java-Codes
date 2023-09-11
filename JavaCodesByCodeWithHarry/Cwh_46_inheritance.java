package com.company;
class base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    base(){
        System.out.println("I am a base class constructor");
    }
    base(int x) {
        this.x = x;
        System.out.println("The value of x is " + x);
    }
}
class derived extends base{
    public derived() {
//        super(4);
        System.out.println("I am a derived class constructor");
    }

    public derived(int x , int y) {
        super(x);
        System.out.println("The value of y is "+ y);
    }
}
class childOfDerived extends derived{
    public childOfDerived() {
        System.out.println("I am a childOfDerived class constructor");
    }

    public childOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("The value of z is "+ z);
    }
}
public class Cwh_46_inheritance {
    public static void main(String[] args) {
//        derived d = new childOfDerived();
        derived d = new childOfDerived(1,2,3);


    }}
