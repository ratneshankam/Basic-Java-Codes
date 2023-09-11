package com.company;
class A{
    int a;
    public int harry(){
        return 4;
    }
    public void method2(){
        System.out.println("I am method 2 in class A");
    }
}
class B extends A {
    @Override   //Not necessary but recommended
    public void method2(){
        System.out.println("I am method 2 in class B");
    }
}
public class Cwh_48_methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();
        B b = new B();
        b.method2();
    }
}
