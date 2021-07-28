package _7_exceptions.examples;

import java.util.Scanner;

public class Ex06ThrowException {
    public static void main(String[] args) throws IllegalAccessException {
        final String PASSWORD = "xjTr4*s!m67";
        final int MAX_ATTEMPTS = 3;

        String passwordTypedByUser;
        int attempts = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Write password (attempt number " + attempts + "): ");
            passwordTypedByUser = scanner.nextLine();
            attempts++;
        } while (!PASSWORD.equals(passwordTypedByUser) && attempts <= MAX_ATTEMPTS);
        scanner.close();

        if (!PASSWORD.equals(passwordTypedByUser)) {
            throw new IllegalAccessException("Access Denied!");
        }

        System.out.println("Welcome!");
    }
}
