package _4_flow_control.exe11;

import java.util.Scanner;

/**
 * Write a java program that reads a number and prints all the multiplications of 2 up to that number.
 * <p>
 * For example: for the number 6 it should print:
 * 2 (2 X 1)
 * 4 (2 X 2)
 * 6 (2 X 3)
 * 8 (2 X 4)
 * 10 (2 X 5)
 * 12 (2 X 6)
 *
 * @author Tal Green
 */
public class MultiOfTwo {

    public static void main(String[] args) {
        int num = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i * 2);
        }

    }

}
