package com.company;
class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Cannot add 8 and 9";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input cannot be greater than 100000";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot divide by 0";
    }
}
class MultiplyInputException extends Exception{
    @Override
    public String toString(){
        return "Input cannot be greater than 7000 while multiplying";
    }
}
class CustomCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if ( a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if ( a == 8 || b == 9){
            throw new InvalidInputException();
        }
        return a + b;
    }
    double subtract(double a, double b) throws InvalidInputException, MaxInputException{
        if ( a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if ( a == 8 || b == 9){
            throw new InvalidInputException();
        }
        return a - b;
    }
    double multiply(double a, double b) throws MaxInputException, MultiplyInputException, InvalidInputException{
        if ( a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        else if ( a > 7000 || b > 7000){
            throw new MultiplyInputException();
        }
        if ( a == 8 || b == 9){
            throw new InvalidInputException();
        }
        return a * b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException, InvalidInputException{
        if ( a == 8 || b == 9){
            throw new InvalidInputException();
        }
        else if( b == 0){
            throw new CannotDivideByZeroException();
        }
        else if ( a > 100000 || b > 100000){

            throw new MaxInputException();
        }
        return a / b;
    }
}
public class Cwh_87_customCalc2 {
    public static void main(String[] args) throws InvalidInputException,  MaxInputException, CannotDivideByZeroException{
        CustomCalculator c = new CustomCalculator();
//        c.add(8,8);
        c.divide(3333333, 10);
    }
}
