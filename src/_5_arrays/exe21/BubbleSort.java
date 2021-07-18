package _5_arrays.exe21;

import java.util.Arrays;

/**
 * Write a Java program the sorts an array by using the �Bubble Sort� algorithm, explained below.
 * <p>
 * Bubble sort is a simple sorting algorithm that repeatedly scan the array, compares each pair of adjacent items and swaps them if they are in the wrong order. The pass through the array is repeated until no swaps are needed, which indicates that the list is sorted.
 * <p>
 * Questions before starting:
 * - What each pass does?
 * - How many passes do we need?
 * - After writing the program � how can we improve it to make less passes?
 *
 * @author Tal Green
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {3, 1, 40, 2, 100, 8};
        int passIndex = array.length - 1;

        while (passIndex > 0) // This loop controls the end of each pass
        {
            for (int i = 0; i < passIndex; i++)  // The current pass - from 0 to passIndex
            {
                if (array[i] > array[i + 1]) {
                    // Swap array [i] & array [i+1]
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            passIndex--;
        }

        System.out.println("The sorted array:");
        System.out.println(Arrays.toString(array));

    }

}
