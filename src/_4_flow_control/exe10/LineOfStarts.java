package _4_flow_control.exe10;

import java.util.Scanner;

/**
 * Write a java program that reads a number and prints a line of �*� with the length of the number.
 * <p>
 * For example: for the number 5 you should print:
 * *****
 * <p>
 * Tip: In order to print and stays on the same line use:
 * System.out.print()
 *
 * @author Tal Green
 */
public class LineOfStarts {

    public static void main(String[] args) {
        int num = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }

    }

}
