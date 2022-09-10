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
        int numOfCompetitors;
        int currentVote;
        int[] votesPerCompetitor;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the numbers of competitors: ");
        numOfCompetitors = in.nextInt();
        votesPerCompetitor = new int[numOfCompetitors];

        System.out.println("Enter vote (between 1.." + numOfCompetitors + ", -1 to finish)");
        currentVote = in.nextInt();

        while (currentVote != -1) {
            votesPerCompetitor[currentVote - 1]++;

            System.out.println("Enter vote (between 1.." + numOfCompetitors + ", -1 to finish)");
            currentVote = in.nextInt();
        }

        System.out.println("The votesPerCompetitor are: ");
        System.out.println(Arrays.toString(votesPerCompetitor));

        int minVal = votesPerCompetitor[0];
        int minIndex = 0;

        for (int i = 1; i < votesPerCompetitor.length; i++) {
            if (votesPerCompetitor[i] < minVal) {
                minVal = votesPerCompetitor[i];
                minIndex = i;
            }
        }

        System.out.println("The competitor that leaves the show is: " + (minIndex + 1));
    }
}
