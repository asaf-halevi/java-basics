package _7_exceptions.examples;

import java.util.Scanner;

public class Ex05UncheckedArithmeticExceptionSolution2 {//Good practice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number:");
        int a = scanner.nextInt();
        System.out.print("Second number:");
        int b = scanner.nextInt();
        scanner.close();
        if (b != 0) {
            System.out.println("The result is: " + a / b);
        } else {
            System.err.println("Cannot divide by 0");
        }
    }
}
