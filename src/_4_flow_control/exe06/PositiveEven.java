package _4_flow_control.exe06;

import java.util.Scanner;

/**
 * Write a java program that reads a number and prints if it is a:
 * Positive even number
 * Negative even number
 * Odd number
 * <p>
 * For example:
 * 4: Positive even number
 * 5: Odd number
 * -2: Negative even number
 * -3: Odd number
 *
 * @author Tal Green
 */
public class PositiveEven {
    public static void main(String[] args) {
        int num = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextInt();

        if ((num % 2 == 0) && (num >= 0)) {
            System.out.println("The number is positive & even.");
        } else if ((num % 2 == 0) && (num < 0)) {
            System.out.println("The number is negative & even.");
        } else {
            System.out.println("The number is odd.");
        }

    }

}
