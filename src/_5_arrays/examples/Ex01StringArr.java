package _5_arrays.examples;

import java.util.Scanner;

public class Ex01StringArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[2];

        for (int i = 0; i < words.length; i++) {
            System.out.print("Type a word: ");
            words[i] = scanner.nextLine();
        }

        scanner.close();

        System.out.print("The entire text is: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
