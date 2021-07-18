package _3_strings.exe11;

import java.util.Scanner;

/**
 * Write a java program that writes the last index of the character �a� inside a string.
 *
 * @author Tal Green
 */
public class LastA {

    public static void main(String[] args) {

        String text;
        String textToSearch = "a";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text: ");
        text = in.nextLine();

        // Find the index of the first 'the'
        int index = text.lastIndexOf('a');

        System.out.println("The last index of 'a' is: " + index);
    }

}
