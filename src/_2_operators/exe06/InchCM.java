package _2_operators.exe06;

import java.util.Scanner;

/**
 * Write a java program that reads a number in inches and converts it to cm.
 * 1 inch is 2.54 cm
 *
 * @author Tal Green
 */
public class InchCM {

    public static void main(String[] args) {
        double len;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter len in inches: ");
        len = in.nextDouble();

        System.out.println(len + " inches = " + len * 2.54 + " cm");

        in.close();
    }

}
