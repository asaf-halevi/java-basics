package _4_flow_control.exe02;

import java.util.Scanner;

/**
 * Write a java program that reads an integer and prints if it is an even number.
 *
 * @author Tal Green
 */
public class IsEven {

    public static void main(String[] args) {
        int num = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter num: ");
        num = in.nextInt();

        if (num % 2 == 0) // num is even
        {
            System.out.println("The number " + num + " is even");
        } else {
            System.out.println("The number " + num + " is odd");
        }
    }

}
