/*
    Create a class Game, which allows a user to play "Guess a Number"
    game once. Game should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter for noOfGuess
    use properties such as noOfGuess(int), etc to get this task done!
 */
package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    int comp;
    int user;
    Scanner sc = new Scanner(System.in);
    Game(){
        Random r = new Random();
        comp = r.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("Guess the number: ");
        user = sc.nextInt();
    }
    public void isCorrectNumber(){
        if (user == comp){
            System.out.println("You guess the correct number which is: " + comp);
        }
        else if(user >= comp){
            System.out.println("Your entered number is greater!");
        }else if(user <= comp){
            System.out.println("Your entered number is smaller!");
        }
    }
    public void noOfGuess(int n){
        for(int i = 1; i<n; i++){
            takeUserInput();
            isCorrectNumber();
            if (user == comp){
                System.out.println("You guess the number in '" + i + "' attempts");
                break;
            }
        }
    }
}

public class Cwh_43_Ex3guessNumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        g.noOfGuess(20);

    }
}


                                                                    // Harry bhai's code
//class Game{
//    int number;
//    int inputNumber;
//    int noOfGuesses = 0;
//    Game() {
//        Random r = new Random();
//        this.number = r.nextInt(100);
//    }
//    public int getNoOfGuesses() {
//        return noOfGuesses;
//    }
//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }
//    void takeUserInput(){
//        System.out.println("Guess the number:");
//        Scanner sc = new Scanner(System.in);
//        inputNumber = sc.nextInt();
//    }
//    boolean isCorrectNumber(){
//        noOfGuesses++;
//        if (inputNumber == number){
//            System.out.format("Yes you guessed is right, it was %d\nYou guessed it in %d attempts.", number, noOfGuesses);
//            return true;
//        }
//        else if (inputNumber < number){
//            System.out.println("Too low...");
//        }
//        else if (inputNumber > number){
//            System.out.println("Too high...");
//        }
//        return false;
//    }
//}
//class Cwh_43_Ex3guessNumberGame{
//    public static void main(String[] args) {
//        Game g = new Game();
//        boolean b = false;
//        while (!b){
//            g.takeUserInput();
//            b = g.isCorrectNumber();
//        }
//    }
//}