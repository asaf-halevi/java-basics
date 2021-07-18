package _4_flow_control.exe08;

import java.util.Scanner;

/**
 * Write a Java program that accepts three numbers and prints:
 * <p>
 * - "All numbers are equal" if all three numbers are equal
 * - "All numbers are different" if all three numbers are different
 * - "Neither all are equal or different" otherwise
 *
 * @author Tal Green
 */
public class AllNumbers {

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

        if (num1 == num2 && num2 == num3)// Check if all numbers are equal
        {
            System.out.println("All numbers are equal.");

        } else if (num1 != num2 && num2 != num3)// Check if all numbers are different
        {
            System.out.println("All numbers are different.");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
