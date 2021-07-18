package _3_strings.exe13;

import java.util.Scanner;

/**
 * Write a java program that prints the first 3 characters of a string.
 *
 * @author Tal Green
 */
public class Print3FirstChars {

    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text: ");
        text = in.nextLine();

        System.out.println("The first 3 characters of the text are: " + text.substring(0, 3));
    }

}
