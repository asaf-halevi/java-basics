package _2_operators.exe04;

import java.util.Scanner;

/**
 * Write a java program that reads 1 double number and set a Boolean variable the following value:
 * True � if the number if positive or 0
 * False � if the number is negative
 * <p>
 * For example:
 * for 4.6: true
 * For -8.6: false
 *
 * @author Tal Green
 */
public class IsPositive {

    public static void main(String[] args) {
        double num;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextDouble();

        boolean isPositive = num >= 0;

        System.out.println("Is positive: " + isPositive);
    }
}
