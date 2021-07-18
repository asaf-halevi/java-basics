package _4_flow_control.exe01;

import java.util.Scanner;

/**
 * Write a java program that reads 2 strings and prints if they are the same.
 *
 * @author Tal Green
 */
public class SameStrings {

    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter str1: ");
        str1 = in.nextLine();

        System.out.print("Enter str2: ");
        str2 = in.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The 2 strings are equels.");
        } else {
            System.out.println("The 2 strings are NOT equels.");
        }

    }

}
