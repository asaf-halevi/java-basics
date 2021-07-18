package _6_methods.exe15;

import java.util.Arrays;

/**
 * Write a java method that gets an array of integers and returns a version of the given array where
 * all the 10's have been removed. The remaining elements should shift left towards
 * the start of the array as needed, and the empty spaces a the end of the array should be 0.
 * <p>
 * For example: for the array {1, 10, 10, 2}, this will be returned:  {1, 2, 0, 0}
 *
 * @author Tal Green
 */
public class RemoveNumberFromArray {

    public static void main(String[] args) {
        int[] arr = {10, 2, 10, 5, 10, 10, 9, 10};
        removeAllNumbers(arr, 10);

        System.out.println(Arrays.toString(arr));

    }

    /**
     * This method gets an array and a number. It will remove all occurrences of that number in the array.
     * All other element will shift left. Empty elements will have 0 in them.
     *
     * @param arr    Array of integers
     * @param number A number to remove
     */
    public static void removeAllNumbers(int[] arr, int number) {
        // Find the first index of the number to remove
        int index = findIndexOfNumber(arr, number);

        // While there are numbers to remove - remove them
        while (index != -1) {
            // Remove the found number
            removeElementFromArray(arr, index);

            // Find the next number
            index = findIndexOfNumber(arr, number);
        }
    }

    /**
     * Gets an array of integers and a number. Returns the first index of that numnber in the array. -1 if not found
     */
    public static int findIndexOfNumber(int[] arr, int number) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return index;
    }

    /**
     * This method gets an array and an index. It will remove the element at that index, and shift left all remaining elements. The last empty element will be 0.
     *
     * @param arr           An array of integers
     * @param indexToRemove Index of an element to remove
     */
    public static void removeElementFromArray(int[] arr, int indexToRemove) {
        // Check that the index is valid index
        if (indexToRemove < 0 || indexToRemove > arr.length - 1) {
            return;
        }

        // Start iterating from the index to remove
        for (int i = indexToRemove; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];    // Copy the next element to the current element
        }

        // Put 0 in the last element
        arr[arr.length - 1] = 0;
    }

}
