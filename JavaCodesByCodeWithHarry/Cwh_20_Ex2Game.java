package com.company;
import java.util.Random;
import java.util.Scanner;
public class Cwh_20_Ex2Game {
    public static void main(String[] args) {
        Random r = new Random();
        int upperbond = 3;
        int comp = r.nextInt(upperbond);
        Scanner sc = new Scanner(System.in);
        System.out.println("0. Stone\n1. Paper\n2. Scissor");
        int i = 0;
        System.out.format("How many times you want to play the game! --> Enter the number: ");
        int n = sc.nextInt();
        while (i < n) {
            System.out.format("Enter your choice: ");
            int choice = sc.nextInt();
            if (comp == choice) {
                System.out.println("Your choice is " + choice + " and computer is " + comp + " so, its a tie in game!!!");
            } else if (comp == 0 && choice == 1) {
                System.out.println("Your choice is 'Paper' and computer is 'Stone' so, You are the winner in game!!!");
            } else if (comp == 1 && choice == 2) {
                System.out.println("Your choice is 'Scissor' and computer is 'Paper' so, You are the winner in game!!!");
            } else if (comp == 2 && choice == 0) {
                System.out.println("Your choice is 'Stone' and computer is 'Scissor' so, You are the winner in game!!!");
            } else if (comp == 1 && choice == 0) {
                System.out.println("Computer choice is 'Paper' and Your is 'Stone' so, You Lose game!!!");
            } else if (comp == 2 && choice == 1) {
                System.out.println("Computer choice is 'Scissor' and Your is 'Paper' so, You Lose game!!!");
            } else if (comp == 0 && choice == 2) {
                System.out.println("Computer choice is 'Stone' and Your is 'Scissor' so, You Lose game!!!");
            }
            i++;
        }
    }
}
