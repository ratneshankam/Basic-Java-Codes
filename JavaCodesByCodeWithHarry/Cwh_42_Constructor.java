package com.company;
class MyEmplo{
    private int id = 34;
    private String name = "RAM";
    public MyEmplo() {
        System.out.println(id);
        System.out.println(name);
    }
    public MyEmplo(int a, String n){
        id = a;
        name = n;
        System.out.println(a + n);
    }
}
public class Cwh_42_Constructor {
    public static void main(String[] args) {
        MyEmplo ram = new MyEmplo();
        MyEmplo ratan = new MyEmplo(24, "Ratnesh");


    }

}
