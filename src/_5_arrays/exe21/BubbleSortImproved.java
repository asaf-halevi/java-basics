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
public class BubbleSortImproved {

    public static void main(String[] args) {
        //		int[] array = { 3, 1, 40, 2, 100, 8 }; 	// 3 passes
        int[] array = {1, 2, 3, 4, 5, 6};        // The array is sorted - only 1 pass is needed
        //		int[] array = { 6, 5, 4, 3, 2, 1 };		// The array is sorted descending - 5 passes are needed

        int passIndex = array.length - 1;
        int numOfPass = 0;
        boolean isSwapWasMade = true; // Flag to check if swap was made in the current pass.

        while (passIndex > 0 && isSwapWasMade) // This loop controls the end of each pass. Exit it if no swap was done in the prev pass
        {
            numOfPass++;
            isSwapWasMade = false;

            for (int i = 0; i < passIndex; i++)  // The current pass - from 0 to passIndex
            {

                if (array[i] > array[i + 1]) {
                    // Swap array [i] & array [i+1]
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;

                    isSwapWasMade = true;    // Indicates that a swap was made
                }
            }
            passIndex--;
        }

        System.out.println("Num of passes: " + numOfPass);
        System.out.println("The sorted array:");
        System.out.println(Arrays.toString(array));

    }

}
