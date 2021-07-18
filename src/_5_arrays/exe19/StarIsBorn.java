package _5_arrays.exe19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * In the show �Star is born� there are N competitors.
 * The viewers are asked to vote for their favorite competitor.
 * At each show � the competitor with the less amount of votes will leave the show.
 * <p>
 * Write a Java program that reads the number of competitors and then read all the viewer votes. This will end by typing -1.
 * <p>
 * The program will print who is the competitor that should leave the show.
 *
 * @author Tal Green
 */
public class StarIsBorn {

    public static void main(String[] args) {
        int numOfcompetitors;
        int curVote;
        int[] votes; // This array represents the number of votes of each competitor

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the numbers of competitors: ");
        numOfcompetitors = in.nextInt();
        votes = new int[numOfcompetitors];

        // Read the first vote
        System.out.println("Enter vote (between 1.." + numOfcompetitors + ", -1 to finish)");
        curVote = in.nextInt();

        while (curVote != -1) // Repeat while vote is not -1
        {
            votes[curVote - 1]++; // add the current vote to the relevant competitor

            System.out.println("Enter vote (between 1.." + numOfcompetitors + ", -1 to finish)");
            curVote = in.nextInt(); // Read the next vote
        }

        // print the votes array

        System.out.println("The votes are: ");
        System.out.println(Arrays.toString(votes));

        // Find the min value and index

        int minVal = votes[0];
        int minIndex = 0;

        for (int i = 1; i < votes.length; i++) {
            if (votes[i] < minVal) {
                minVal = votes[i];
                minIndex = i;
            }
        }

        System.out.println("The competitor that leaves the show is: " + (minIndex + 1));
    }

}
