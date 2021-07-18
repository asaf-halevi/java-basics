package _3_strings.exe04;

import java.util.Scanner;

/**
 * 1. Write a Java program that reads a String and check if it match the secret password �Ken sent me�.
 * <p>
 * If there is a match � write true. Else � false.
 * <p>
 * 2. Change the check to match any case.
 *
 * @author Tal Green
 */
public class Password {

    public static void main(String[] args) {
        String password;

        Scanner in = new Scanner(System.in);

        System.out.print("What is the password: ");
        password = in.nextLine();

        boolean isMatch = password.equals("Ken sent me");
        System.out.println("Correct Password? " + isMatch);

        isMatch = password.equalsIgnoreCase("Ken sent me");
        System.out.println("Correct Password any case? " + isMatch);

        in.close();

    }

}
