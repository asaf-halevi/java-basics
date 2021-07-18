package _4_flow_control.exe18;

import java.util.Scanner;

/**
 * Write a program in Java to display the following pattern based on an input. This should be printed for the number 4:
 * <p>
 * 1
 * 22
 * 333
 * 4444
 *
 * @author Tal Green
 */
public class Pattern2 {
    public static void main(String[] args) {
        int num = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
