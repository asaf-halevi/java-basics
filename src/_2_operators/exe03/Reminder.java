package _2_operators.exe03;

import java.util.Scanner;

/**
 * Write a java program that reads 2 integers and prints the reminder of the division of them. For example: for 10 & 3 � the result is 1.
 *
 * @author Tal Green
 */
public class Reminder {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        num1 = in.nextInt();

        System.out.print("Enter num 2: ");
        num2 = in.nextInt();

        System.out.println("The remider is: " + num1 % num2);

        in.close();
    }

}
