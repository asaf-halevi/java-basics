package _3_strings.exe09;

import java.util.Scanner;

/**
 * Write a java program that writes the first index of the string �the� inside a string.
 *
 * @author Tal Green
 */
public class FirstThe {

    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text: ");
        text = in.nextLine();

        // Change the text to lower case in order to find lower case 'the'
        text = text.toLowerCase();

        int index = text.indexOf("the");

        System.out.println("The first index of the word 'the' is: " + index);
    }

}
