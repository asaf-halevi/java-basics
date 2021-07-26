package _5_arrays.examples;

import java.util.Scanner;

public class Ex00WithoutArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1, word2;

        System.out.print("Type a word: ");
        word1 = scanner.nextLine();

        System.out.print("Type a word: ");
        word2 = scanner.nextLine();

        scanner.close();

        System.out.print("The entire text is: ");
        System.out.print(word1 + " ");
        System.out.print(word2 + " ");
    }
}
