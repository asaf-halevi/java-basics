package _4_flow_control.exe13;

import java.util.Scanner;

/**
 * Write a java program that reads a number and prints the sum from 1 to the number.
 * For example: For 3 the output is 6 (1+2+3).
 *
 * @author Tal Green
 */
public class Series {

    public static void main(String[] args) {
        int num = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextInt();

        int accumulator = 0;

        for (int i = 1; i <= num; i++) {
            accumulator += i;
        }

        System.out.println("The sum from 1 to " + num + " is: " + accumulator);
    }

}
