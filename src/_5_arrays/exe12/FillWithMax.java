package _5_arrays.exe12;

import java.util.Arrays;

/**
 * Write a Java program that gets an array of integers, figure out which is larger, the first or last element in the array, and set all the other elements to be that value.
 * <p>
 * You can assume that the array length is at least 3.
 * <p>
 * Examples:
 * [1, 2, 3] → [3, 3, 3] [11, 5, 33, 9] → [11, 11, 11, 11]
 *
 * @author Tal Green
 */
public class FillWithMax {

    public static void main(String[] args) {
        int[] arr = {11, 5, 33, 9};
        int max;

        // compare the first & last elements and save the bigger
        if (arr[0] > arr[arr.length - 1]) {
            max = arr[0];
        } else {
            max = arr[arr.length - 1];
        }

        // iterate over the array and replace all elements with the max value.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = max;
        }

        // print the new array
        System.out.println(Arrays.toString(arr));
    }

}
