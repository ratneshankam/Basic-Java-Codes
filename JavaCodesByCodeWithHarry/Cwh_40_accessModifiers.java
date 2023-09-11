package com.company;
class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }

}
public class Cwh_40_accessModifiers {
    public static void main(String[] args) {
    MyEmployee ratnesh = new MyEmployee();
    // Throws an error due to private access modifier
//    ratnesh.id = 24;
//    ratnesh.name = "ratan";
        ratnesh.setId(24);
        System.out.println(ratnesh.getId());
        ratnesh.setName("ratan");
        System.out.println(ratnesh.getName());

    }
}
