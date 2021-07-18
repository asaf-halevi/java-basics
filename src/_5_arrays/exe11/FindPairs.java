package _5_arrays.exe11;

import java.util.Scanner;

/**
 * Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number
 *
 * @author Tal Green
 */
public class FindPairs {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 0, 2};
        int sumToFind;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sum to find: ");
        sumToFind = in.nextInt();

        System.out.println("The pairs are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sumToFind) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    break;
                }
            }
        }

    }

}
