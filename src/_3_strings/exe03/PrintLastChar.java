package _3_strings.exe03;

import java.util.Scanner;

/**
 * Write a Java program that gets a string and prints its last character.
 *
 * @author Tal Green
 */
public class PrintLastChar {
    public static void main(String[] args) {
        String text;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text:");
        text = in.nextLine();

        int lastCharIndex = text.length() - 1;

        System.out.println("The last char is: " + text.charAt(lastCharIndex));

        in.close();
    }

}
