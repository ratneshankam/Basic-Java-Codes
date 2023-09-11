package com.company;
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
public class Cwh_84_throwsThrow {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            double d = divide(6,1);
            System.out.println(d);
            double ar = area(3);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception Occurred.");
        }
    }
}
