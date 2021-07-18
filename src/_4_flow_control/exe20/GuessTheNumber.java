package _4_flow_control.exe20;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a Java program for the game �Guess the number�:
 * The program select a random number between 1 and 100.
 * The user needs to guest that number.
 * There will be a loop that:
 * - Will ask the user to guess the number.
 * - If the guess is correct � it will print that the guess is correct and the number of guesses.
 * - If the guess is incorrect � it will print if the selected number is above or below the guess.
 * - The game can be stopped at any time by typing -99 or EOL (you can select).
 * <p>
 * How to generate a random number is a range:
 * Random rand = new Random();
 * randomNumber = rand.nextInt(max - min+1) + min;
 *
 * @author Tal Green
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        int randomNumber;
        int guess;
        int counter = 0;

        // The range of the random number
        int min = 1;
        int max = 100;

        // Generate a random number in the correct range
        Random rand = new Random();
        randomNumber = rand.nextInt(max - min + 1) + min;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your guess (-99 to exit):");
        guess = in.nextInt();

        while (guess != -99) {
            counter++;

            if (guess == randomNumber) {
                System.out.println("You are correct! The number is: " + guess);
                System.out.println("It took you " + counter + " turns to guess.");
                return;
            }

            if (randomNumber > guess) {
                System.out.println("The selected number is above your guess");
            } else {
                System.out.println("The selected number is below your guess");
            }

            System.out.println("Please enter your guess (-99 to exit):");
            guess = in.nextInt();
        }
    }

}
