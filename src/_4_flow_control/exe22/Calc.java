package _4_flow_control.exe22;

import java.util.Scanner;

/**
 * Write a Java program that reads a string that represent a simple mathematical sentence with the following format:
 * <digit> <operator> <digit>
 * <p>
 * It should type the result of it.
 * <p>
 * For example: for �4*2� it should type 8.
 *
 * @author Tal Green
 */
public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please type a mathematical sentence of the format <digit><operator><digit>:");
        String sentence = in.nextLine();

        int x, y;
        char operator;
        char tempChar;
        String tempStr;

        // Get the first character
        tempChar = sentence.charAt(0);

        // Convert first char to string, and from string to int
        tempStr = String.valueOf(tempChar);
        x = Integer.valueOf(tempStr);

        // Get the last character
        tempChar = sentence.charAt(2);

        // Convert last char to string, and from string to int
        tempStr = String.valueOf(tempChar);
        y = Integer.valueOf(tempStr);

        // get the operator
        operator = sentence.charAt(1);

        System.out.print(sentence + "=");
        switch (operator) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println((double) x / y);
                break;
        }

    }

}
