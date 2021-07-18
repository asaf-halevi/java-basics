package _2_operators.exe07;

import java.util.Scanner;

/**
 * Write a java program that reads a 2 digits integer and prints the sum of its digits.
 * <p>
 * For example: For the number 26, the result is 8 (2+6).
 *
 * @author Tal Green
 */
public class SumOfDigits {

    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 2-digit integer number: ");
        num = in.nextInt();

        sum += num % 10; // Find the right digit
        sum += num / 10; // find the left digit

        System.out.println("The sum of lenght is: " + sum);

        in.close();
    }

}
