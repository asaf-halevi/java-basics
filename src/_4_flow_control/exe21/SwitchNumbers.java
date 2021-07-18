package _4_flow_control.exe21;

import java.util.Scanner;

/**
 * Write a Java program that reads a string that represent a digit (0..9).
 * It should print the name of the digit. It the text does not represent a digit type error.
 * <p>
 * For example:
 * For 4 type �four�
 *
 * @author Tal Green
 */
public class SwitchNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please a digit:");
        int digit = in.nextInt();

        switch (digit) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Error - Number is not a digit");
        }

    }

}
