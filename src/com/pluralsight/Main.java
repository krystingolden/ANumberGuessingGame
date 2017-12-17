package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class Main {

/*
https://programmingbydoing.com/

A Number Guessing Game - Assignment #43
 */

    public static void main(String[] args) {
        // write your code here

        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);

        int x = r.nextInt(10);

        System.out.println("Choose a number from 1 - 10");
        int userChoice = keyboard.nextInt();

        System.out.println("Your number was " + userChoice);
        System.out.println("The secret number was " + x);
        if (userChoice == x) {
            System.out.println("Congratulations! You chose the right number!");
        }
        else{
            System.out.println("Oops, that wasn't the right number");
        }

    }
}
