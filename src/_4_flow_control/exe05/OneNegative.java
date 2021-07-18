package _4_flow_control.exe05;

import java.util.Scanner;

/**
 * Write a java program that reads 2 numbers and prints true if at least 1 of them is negative.
 *
 * @author Tal Green
 */
public class OneNegative {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        num1 = in.nextInt();

        System.out.print("Enter num 2: ");
        num2 = in.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("At least one number is negative");
        } else {
            System.out.println("Non of the numbers are negative");
        }

    }

}
