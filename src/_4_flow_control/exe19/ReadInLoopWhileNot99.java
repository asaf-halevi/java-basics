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
public class ReadInLoopWhileNot99 {
    public static void main(String[] args) {
        int num;
        int sum;
        int min;
        int max;
        double avg;
        int counter = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        num = in.nextInt();

        if (num == -99) {
            System.exit(0);
        }

        sum = min = max = num;

        System.out.println("Please enter a number: ");
        num = in.nextInt();
        while (num != -99) {
            counter++;
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            System.out.println("Please enter a number: ");
            num = in.nextInt();
        }

        avg = (double) sum / counter;

        System.out.println("The sum is: " + sum);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
        System.out.println("The avg is: " + avg);
        System.out.println("The count is: " + counter);

        in.close();
    }

}
