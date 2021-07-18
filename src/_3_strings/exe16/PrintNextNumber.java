package _3_strings.exe16;

import java.util.Scanner;

/**
 * Write a java program that reads a string that represents an integer number and prints the following number.
 * <p>
 * For example: for the text �10� it will print 11.
 *
 * @author Tal Green
 */
public class PrintNextNumber {

    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text: ");
        text = in.nextLine();

        int num = Integer.parseInt(text);
        System.out.println("The next number is: " + (num + 1));
    }

}
