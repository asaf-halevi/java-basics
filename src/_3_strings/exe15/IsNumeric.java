package _3_strings.exe15;

import java.util.Scanner;

/**
 * Write a java program that reads a string and type if its represent a number.
 * <p>
 * Hint: Find a way to convert the string to double.
 *
 * @author Tal Green
 */
public class IsNumeric {

    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text: ");
        text = in.nextLine();

        double num = Double.parseDouble(text);
        System.out.println("The text is a nunber: " + num);
    }

}
