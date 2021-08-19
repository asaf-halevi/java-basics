package _9_inheritance.examples.book_store;

import java.util.Scanner;

public class MyString {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        String userString;
        String innerString;
        int userIndex;
        boolean isContains;

        System.out.println("What string would you like me to process?");
        userString = myInput.nextLine();
        System.out.println("what position would you like to see? ");
        userIndex = myInput.nextInt();

        System.out.println("You asked to see character number " + userIndex);
        System.out.println("That is the character " + userString.charAt(userIndex - 1));

        System.out.println("The 1st, 3rd and 5th characters are " + userString.charAt(0) + "," + userString.charAt(2) + "," + userString.charAt(4));
        System.out.println(("the last Character is " + userString.charAt(userString.length() - 1)));

        System.out.println("substring please.");
        innerString = myInput.next();

        isContains = userString.contains(innerString);
        System.out.println("str2 is sub-string of str1: " + isContains);

        myInput.close();
    }
}
