package _2_operators.exe02;

import java.util.Scanner;

/**
 * Write a java program that reads first name & last name into 2 variables and prints �Hello <FirstName> <LastName>".
 *
 * @author Tal Green
 */
public class Hello {

    public static void main(String[] args) {
        String firstName;
        String lastName;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = in.nextLine();

        System.out.print("Enter last name: ");
        lastName = in.nextLine();

        System.out.println("Hello " + firstName + " " + lastName);

        in.close();

    }

}
