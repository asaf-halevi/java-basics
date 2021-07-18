package _4_flow_control.exe03;

import java.util.Scanner;

/**
 * Write a java program prints the center character(2) of a string:
 * - If the length is odd, prints the character in the middle.
 * - If the length is even, prints the 2 characters in the middle.
 *
 * @author Tal Green
 */
public class PrintCenter {

    public static void main(String[] args) {
        String str;
        String centerChars;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = in.nextLine();

        // Get the length of the string
        int centerIndex = str.length() / 2;

        if (str.length() % 2 == 0) // the string length is even
        {
            // Get the 2 middle characters
            centerChars = str.substring(centerIndex - 1, centerIndex + 1);
        } else // The string length is odd
        {
            // Get the 1 middle character
            centerChars = str.substring(centerIndex, centerIndex + 1);
        }

        System.out.println("The center character(s) are: " + centerChars);
        in.close();
    }

}
