package _4_flow_control.exe19;

import java.util.Scanner;

/**
 * Write a Java program that reads numbers from the user in a loop.
 * It should keep on reading them until -99 is read or end of line (you can decide).
 * <p>
 * After reading all the files, it should print the following:
 * The sum of all the numbers
 * The min & max numbers
 * The average
 *
 * @author Tal Green
 */
public class ReadInLoopWhileNotEOL {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        int min = 0;
        int max = 0;
        double avg = 0;
        int counter = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        num = in.nextInt();
        sum = min = max = num;

        System.out.println("Please enter a number: ");
        while (in.hasNextInt()) {
            num = in.nextInt();

            counter++;
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            System.out.println("Please enter a number: ");
        }

        avg = (double) sum / counter;

        System.out.println("The sum is: " + sum);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
        System.out.println("The avg is: " + avg);
        System.out.println("The count is: " + counter);

    }

}
