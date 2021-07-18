package _3_strings.exe14;

import java.util.Scanner;

/**
 * Write a java program that prints the last 4 characters of a string.
 *
 * @author Tal Green
 */
public class Print4LastChars {

    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text: ");
        text = in.nextLine();

        int len = text.length();
        System.out.println("The last 4 characters of the text are: " + text.substring(len - 4));
    }

}
