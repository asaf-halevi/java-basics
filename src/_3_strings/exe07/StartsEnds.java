package _3_strings.exe07;

import java.util.Scanner;

/**
 * A. Write a java program that reads 2 strings and prints:
 * True  - If the first string starts with the second string
 * False � otherwise.
 * <p>
 * B. Write a java program that reads 2 strings and prints:
 * True  - If the first string starts or ends with the second 			string
 * False � otherwise.
 *
 * @author Tal Green
 */
public class StartsEnds {

    public static void main(String[] args) {

        String text1;
        String text2;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first text: ");
        text1 = in.nextLine();

        System.out.print("Enter second text: ");
        text2 = in.nextLine();

        boolean isStartsWith = text1.startsWith(text2);
        System.out.println("Is first text starts with the second text: " + isStartsWith);

        boolean isStartsOrEnds = text1.startsWith(text2) || text1.endsWith(text2);
        System.out.println("Is first text starts or ends with the second text: " + isStartsOrEnds);
    }

}
