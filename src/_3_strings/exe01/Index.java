package _3_strings.exe01;

import java.util.Scanner;

/**
 * Write a Java program to get the character at the given index within the String.
 *
 * @author Tal Green
 */
public class Index {
    public static void main(String[] args) {
        String text;
        int index;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text:");
        text = in.nextLine();

        System.out.print("Enter index:");
        index = in.nextInt();

        System.out.println("The char at index '" + index + "' in '" + text + "'  is: " + text.charAt(index));

        in.close();
    }

}
