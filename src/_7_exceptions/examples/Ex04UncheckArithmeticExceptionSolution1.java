package _7_exceptions.examples;

import java.util.Scanner;

public class Ex04UncheckArithmeticExceptionSolution1 {//bad practice

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number:");
        int a = scanner.nextInt();
        System.out.print("Second number:");
        int b = scanner.nextInt();
        scanner.close();
        try {
            System.out.println("The result is: " + a / b);
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by 0");
        }
    }
}
