package _5_arrays.exe09;

import java.util.Arrays;

/**
 * Write a Java that reverse an array of integers.
 *
 * @author Tal Green
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 10, 56};

        int lowIndex = 0;
        int highIndex = arr.length - 1;

        while (lowIndex < highIndex) {
            int temp = arr[lowIndex];
            arr[lowIndex] = arr[highIndex];
            arr[highIndex] = temp;

            lowIndex++;
            highIndex--;
        }

        System.out.println(Arrays.toString(arr));

    }

}
