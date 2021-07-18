package _3_strings.exe06;

import java.util.Scanner;

/**
 * Write a java program that reads 1 string and prints:
 * True  - if all the characters are in upper case.
 * False � otherwise.
 *
 * @author Tal Green
 */
public class CheckCase {

    public static void main(String[] args) {
        String str = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        str = in.nextLine();

        boolean res = str.equals(str.toUpperCase());

        System.out.println("str is all upper case: " + res);
    }

}
