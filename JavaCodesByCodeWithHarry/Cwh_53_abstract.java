package com.company;
abstract class Parent{
    public Parent() {
        System.out.println("Mai base ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class Child1 extends Parent{           //Check without abstract keyword
    public void the(){
        System.out.println("I am good");
    }
}
public class Cwh_53_abstract {
    public static void main(String[] args) {
//        Parent p = new Parent();              // Throws an error
        Child c = new Child();
//        Child1 c1 = new Child1();             // Throws an error

    }
}
