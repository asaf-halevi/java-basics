package _3_strings.exe10;

import java.util.Scanner;

/**
 * Write a java program that writes the second index of the string �the� inside a string.
 *
 * @author Tal Green
 */
public class SecondeThe {

    public static void main(String[] args) {

        String text;
        String textToSearch = "the";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text: ");
        text = in.nextLine();

        // Change the text to lower case in order to find lower case 'the'
        text = text.toLowerCase();

        // Find the index of the first 'the'
        int index = text.indexOf(textToSearch);

        // Find the index of the second 'the'
        index = text.indexOf(textToSearch, index + 1);

        System.out.println("The second index of the word 'the' is: " + index);
    }

}
