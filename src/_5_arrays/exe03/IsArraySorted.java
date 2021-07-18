package _5_arrays.exe03;

/**
 * Write a java program that prints if a given array of numbers is sorted or not.
 *
 * @author Tal Green
 */
public class IsArraySorted {

    public static void main(String[] args) {
        // Not sorted
        //int [] arr = {5,10,26,4,100,30};

        // Sorted
        int[] arr = {5, 10, 26, 100, 100, 300};

        boolean isSorted = true; // Assuming array is sorted until proven otherwise

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) // The current element and the next one are not sorted: all array is not sorted.
            {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is NOT sorted");
        }

    }

}
