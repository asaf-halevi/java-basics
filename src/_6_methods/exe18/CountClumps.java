package _6_methods.exe18;

/**
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
 * Write a Java method that returns the number of clumps in the given array.
 * <p>
 * Examples:
 * countClumps([1, 2, 2, 3, 4, 4]) → 2
 * countClumps([1, 1, 2, 1, 1]) → 2
 * countClumps([1, 1, 1, 1, 1]) → 1
 *
 * @author Tal Green
 */
public class CountClumps {

    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));
    }

    /**
     * This method gets an array of ints and return the number of clumps in it.
     * a clump is a series of 2 or more adjacent elements of the same value.
     *
     * @param arr
     * @return
     */
    public static int countClumps(int[] arr) {
        int count = 0;
        boolean inClump = false;

        // Check for empty array or 1 elemet array
        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }

        // Always check 2 adjacent elements, currIndex & nextIndex.
        int currIndex = 0;
        int nextIndex = 1;

        while (nextIndex < arr.length) {
            // if the 2 current elements are the same, and we are NOT inside a clump
            if ((arr[currIndex] == arr[nextIndex]) && !inClump) {
                inClump = true;    // Indicate that we are inside a clump
                count++;        // Add 1 to the clump counter
            } else if (arr[currIndex]
                    != arr[nextIndex])    // If the 2 current element are not the same - update inClump to indicate that we are not in a clump
            {
                inClump = false;
            }

            // Move to the next 2 elements
            currIndex++;
            nextIndex++;
        }

        return count;
    }
}
