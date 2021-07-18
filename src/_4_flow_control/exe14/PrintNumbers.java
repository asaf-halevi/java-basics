package _4_flow_control.exe14;

import java.util.Scanner;

/**
 * Write a java program that reads 2 numbers: min & max.
 * The program should print all the numbers between min & max.
 * For example: for 20 and 24 the output should be:
 * 20
 * 21
 * 22
 * 23
 * 24
 * Note: You can assume that min is lower then max OR you can verify it from code.
 * <p>
 * Add another output, but this time � prints every other number:
 * 20
 * 22
 * 24
 *
 * @author Tal Green
 */
public class PrintNumbers {

    public static void main(String[] args) {
        int min;
        int max;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter min number: ");
        min = in.nextInt();

        System.out.print("Enter max number: ");
        max = in.nextInt();

        if (min > max) {
            System.out.println("Min number is bigger then max, aborting.");
            return;
        }

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = min; i <= max; i += 2) {
            System.out.println(i);
        }

        in.close();
    }

}
