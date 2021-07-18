package _2_operators.exe01;

import java.util.Scanner;

/**
 * Write a java program that reads 2 integers (x, y) and prints the result of the following:
 * x+y
 * x-y
 * x*y
 *
 * @author Tal Green
 */
public class Math {

    public static void main(String[] args) {
        int x;
        int y;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = in.nextInt();

        System.out.print("Enter y: ");
        y = in.nextInt();

        System.out.println("x+y=" + (x + y));
        System.out.println("x-y=" + (x - y));
        System.out.println("x*y=" + (x * y));

        in.close();

    }

}
