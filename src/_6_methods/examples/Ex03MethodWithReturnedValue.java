package _6_methods.examples;

import java.util.Scanner;

public class Ex03MethodWithReturnedValue {

    public static void main(String[] args) {
        int numOfChars = getNumOfChars();
        printChars(numOfChars, '*');
    }

    private static int getNumOfChars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set number of chars: ");
        int numOfChars = scanner.nextInt();
        scanner.close();
        return numOfChars;
    }

    private static void printChars(int numOfChars, char charToPrint) {
        for (int i = 0; i < numOfChars; i++) {
            System.out.print(charToPrint);
        }
    }
}
