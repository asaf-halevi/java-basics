package _4_flow_control.exe04;

import java.util.Scanner;

/**
 * Write a java program that reads num1, num2, num3 and prints true if they form a mathematical sentence:
 * <p>
 * num1+num2=num3
 * or
 * num1-num2=num3
 * <p>
 * False otherwise.
 * <p>
 * For example:
 * For 1, 3, 4: true.
 * For 10, 7, 3: true.
 * For 3, 3, 3: false
 *
 * @author Tal Green
 */
public class IsMathSentence {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        num1 = in.nextInt();

        System.out.print("Enter num 2: ");
        num2 = in.nextInt();

        System.out.print("Enter num3 3: ");
        num3 = in.nextInt();

        if ((num1 + num2) == num3 || (num1 - num2) == num3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
