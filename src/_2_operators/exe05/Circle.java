package _2_operators.exe05;

import java.util.Scanner;

/**
 * Write a java program that gets a radius of a circle and prints the perimeter & area.
 * <p>
 * Perimeter: 2 X PI X Radius
 * Area: PI X R2
 *
 * @author Tal Green
 */
public class Circle {

    public static void main(String[] args) {
        double radius;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        radius = in.nextDouble();

        double perimeter = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);

        in.close();
    }

}
