package miscellaneous;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Please provide a number between 1-6: ");
            number = scanner.nextInt();
            if (isInvalidNumber(number)) {
                System.out.println("The number you've provided does not meet with the requirements!\n");
            }
        } while (isInvalidNumber(number));
        System.out.println("\nThanks, the number you've provided was: " + number);
        scanner.close();
    }

    private static boolean isInvalidNumber(int number) {
        return number < 1 || number > 6;
    }
}
