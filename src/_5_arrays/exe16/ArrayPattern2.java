package _5_arrays.exe16;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 :
 * {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
 * <p>
 * Example:
 * For 3 → [0, 0, 1, 0, 2, 1, 3, 2, 1]
 * For 2 → [0, 1, 2, 1]
 * For 4 → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 *
 * @author Tal Green
 */
public class ArrayPattern2 {

    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        num = in.nextInt();

        int arrLen = num * num;
        int[] arr = new int[arrLen];

        // start filling the array from the end
        int arrIndex = arrLen - 1;

        for (int i = num; i > 0; i--) {
            int j;
            for (j = 1; j <= i; j++) {
                arr[arrIndex--] = j;
            }

            // fill with 0 until the end of the current group
            while (j <= num) {
                arr[arrIndex--] = 0;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
