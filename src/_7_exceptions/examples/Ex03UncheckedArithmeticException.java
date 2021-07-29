package _7_exceptions.examples;

import java.util.Scanner;

public class Ex03UncheckedArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number:");
        int a = scanner.nextInt();
        System.out.print("Second number:");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println("The result is: " + a / b);//What will happen if b is 0 ?
    }
}
