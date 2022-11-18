package org.example;

import java.util.Scanner;

public class User {

    public static void getUserInput(){

        Scanner input = new Scanner(System.in);

        System.out.print("Guess a letter: ");
        char letter = input.next().charAt(0);
        System.out.println("You have chosen the letter: " + letter);
        //can add some validation to ensure user is inputting letters

    };

}
