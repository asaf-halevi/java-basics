package _3_strings.exe08;

import java.util.Scanner;

/**
 * Write a java program that reads a string and replace all occurrences of �e� with �_�.
 *
 * @author Tal Green
 */
public class Replace {

    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text: ");
        text = in.nextLine();

        text = text.replaceAll("e", "_");

        System.out.println("The new text is: " + text);
    }

}
