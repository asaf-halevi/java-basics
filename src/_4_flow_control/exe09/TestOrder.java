package _4_flow_control.exe09;

import java.util.Scanner;

/**
 * Write a program that accepts three numbers from the user and prints:
 * <p>
 * - "increasing" if the numbers are in increasing order
 * - "decreasing" if the numbers are in decreasing order
 * - "Neither increasing or decreasing order" otherwise.
 *
 * @author Tal Green
 */
public class TestOrder {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        num1 = in.nextInt();

        System.out.print("Enter num 2: ");
        num2 = in.nextInt();

        System.out.print("Enter num 3: ");
        num3 = in.nextInt();

        if (num1 < num2 && num2 < num3)// Check for increasing order
        {
            System.out.println("Increasing.");

        } else if (num1 > num2 && num2 > num3)// Check for decreasing order
        {
            System.out.println("Decreasing.");
        } else {
            System.out.println("Neither increasing or decreasing");
        }

    }
}
