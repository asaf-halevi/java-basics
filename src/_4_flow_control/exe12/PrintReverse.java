package _4_flow_control.exe12;

import java.util.Scanner;

/**
 * Write a java program that reads a number and prints from it to 1.
 * You can assume its positive number.
 * <p>
 * For example: for 8 prints:
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 *
 * @author Tal Green
 */
public class PrintReverse {

    public static void main(String[] args) {
        int num = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }

    }

}
