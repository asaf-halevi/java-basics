package _3_strings.exe12;

import java.util.Scanner;

/**
 * Write a java program that remove all the white spaces from the beginning and ending of the string.
 *
 * @author Tal Green
 */
public class Trim {

    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text: ");
        text = in.nextLine();

        text = text.trim();

        System.out.println("The text after removing white spaces is: '" + text + "'");
        in.close();
    }

}
