package _4_flow_control.exe24;

import java.util.Scanner;

/**
 * Write a Java program that reads in integer number and prints:
 * How many digits are in it
 * The sum of all its digits.
 * <p>
 * For example: for 12443 the output is 5 & 14
 *
 * @author Tal Green
 */
public class Digits {
    public static void main(String[] args) {
        int num;
        int numOfDigits = 0;
        int sumOfDigits = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");
        num = in.nextInt();

        while (num > 0) {
            numOfDigits++;                // increase the num of digits by 1.
            sumOfDigits += num % 10;    // extract the right most digit
            num = num / 10;                // remove the right most digit from the number
        }

        System.out.println("Num of digits: " + numOfDigits);
        System.out.println("Sum of digits: " + sumOfDigits);
    }

}
