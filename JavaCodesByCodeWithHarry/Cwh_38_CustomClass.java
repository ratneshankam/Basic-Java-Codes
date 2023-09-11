package com.company;
class Employee{
    int id;
    int salary = 0;
    String name = "ram";
    public void printDetails(){
        System.out.println("My id is: " + id);
        System.out.println("and my name is: " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Cwh_38_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee ratnesh = new Employee();  // Instantiating a new Employee object
        Employee john = new Employee();  // Instantiating a new Employee object
        // Setting Attributes
        ratnesh.id = 12;
        ratnesh.salary = 43;
        ratnesh.name = "ratan";
        john.id = 13;
        john.salary = 3;
        john.name = "tripathi";

        // Printing the Attributes
//        System.out.println(ratnesh.id);
//        System.out.println(ratnesh.name);
        ratnesh.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
