package _3_strings.exe05;

import java.util.Scanner;

/**
 * Write a java program that reads 2 strings and prints:
 * True  - if sting 2 is sub string of string 1.
 * False � otherwise.
 *
 * @author Tal Green
 */
public class SubString {

    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        str1 = in.nextLine();

        System.out.print("Enter string 2: ");
        str2 = in.nextLine();

        boolean isSubString = str1.contains(str2);

        System.out.println("str2 is sub-string of str1: " + isSubString);

    }

}
