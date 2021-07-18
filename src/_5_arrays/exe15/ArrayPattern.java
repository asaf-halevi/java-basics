package _5_arrays.exe15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
 * <p>
 * Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
 * <p>
 * Example:
 * For 3 → [1, 1, 2, 1, 2, 3]
 * For 4 → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 * For 2 → [1, 1, 2]
 *
 * @author Tal Green
 */
public class ArrayPattern {

    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        num = in.nextInt();

        int arrLen = num * (num + 1) / 2;
        int[] arr = new int[arrLen];

        int arrIndex = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                arr[arrIndex++] = j;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
