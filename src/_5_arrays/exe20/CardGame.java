package _5_arrays.exe20;

import java.util.Arrays;
import java.util.Scanner;

/**
 * In a card game there are 4 players represented by 1, 2, 3 & 4.
 * In each turn the 3 players will be declared � the winner, the second place and the third place.
 * The forth player will be considered as the looser of the turn.
 * <p>
 * The point each player gets:
 * - The winner gets 7 points.
 * - Second place gets 3 points
 * - Third place do not get any points
 * - Looser looses 4 points.
 * <p>
 * The winner of the game is the player with the highest score at the end of the game.
 * <p>
 * Write a Java program that reads the number of turns, then read for each turn the player numbers of the winner, second & third place.
 * <p>
 * The output is the number of the winner of the game.
 * <p>
 * Note: The total score can be negative.
 *
 * @author Tal Green
 */
public class CardGame {

    public static void main(String[] args) {
        final int NUM_OF_PLAYER = 4;
        int allPlayersSum = 0;    // will be used to calc the number of the 4th player
        int[] playersScore = new int[NUM_OF_PLAYER];    // Each element holds the score of a player.
        int numOfRounds;

        for (int i = 1; i <= NUM_OF_PLAYER; i++) {
            allPlayersSum += i;
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of rounds: ");
        numOfRounds = in.nextInt();

        for (int i = 1; i <= numOfRounds; i++) {
            int place1, place2, place3;
            int looserID;

            System.out.println("Enter 3 scores (winner, second place, third place): ");

            place1 = in.nextInt();
            place2 = in.nextInt();
            place3 = in.nextInt();

            // Give the winner 7 more points
            playersScore[place1 - 1] += 7;

            // Give the second place 3 points
            playersScore[place2 - 1] += 3;

            // Calc the id of the looser
            looserID = allPlayersSum - place1 - place2 - place3;
            playersScore[looserID - 1] -= 4;
        }

        // Print all the scores
        System.out.println("\n\nThe scores of all the players: ");
        System.out.println(Arrays.toString(playersScore));

        // Find the max score & index
        int max = playersScore[0];
        int maxIndex = 0;

        for (int i = 1; i < playersScore.length; i++) {
            if (playersScore[i] > max) {
                max = playersScore[i];
                maxIndex = i;
            }
        }

        System.out.println("The winner is player #" + (maxIndex + 1) + " with " + max + " points.");

    }

}
