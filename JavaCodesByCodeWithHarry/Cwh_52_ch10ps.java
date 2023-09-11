package com.company;
class Circle{
    int radius;
    Circle(int r){
        System.out.println("Inside circle constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder extends Circle{
    int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("Inside cylinder constructor");
    }
    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}
class Rectangle{
    int length, breath;
    Rectangle(int l,int b){
        this.length = l;
        this.breath = b;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreath() {
        return breath;
    }
    public void setBreath(int breath) {
        this.breath = breath;
    }
    public void area(){
        System.out.println(length * breath);
    }
    Rectangle(){
        System.out.println("Inside the Rectangle");
    };
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(int h){
        System.out.println("Inside the Cuboid");
//        super(4,5);
        this.height = h;
    }
    public void volume(){
        System.out.println(length*breath*height);
    }
}
public class Cwh_52_ch10ps {
    public static void main(String[] args) {
//        Circle ob = new Circle(5);
//        Cylinder obj = new Cylinder(7,45);
//        Circle o = new Cylinder(7,45);
        Cuboid obj = new Cuboid(5);
        obj.area();
        obj.volume();
    }
}
