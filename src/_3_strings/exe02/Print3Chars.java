package _3_strings.exe02;

import java.util.Scanner;

/**
 * Write a Java program that gets a string and prints the 1st, 3rd & 5TH characters.
 * <p>
 * For example: For the string �computer� you should print:
 * c
 * m
 * u
 *
 * @author Tal Green
 */
public class Print3Chars {
    public static void main(String[] args) {
        String text;
        int index;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text:");
        text = in.nextLine();

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(2));
        System.out.println(text.charAt(4));

        in.close();
    }

}
