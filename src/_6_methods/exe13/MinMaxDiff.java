package _6_methods.exe13;

/**
 * Write a java method that gets an array of integers and returns the difference between the largest and smallest values in it.
 *
 * @author Tal Green
 */
public class MinMaxDiff {

    public static void main(String[] args) {
        int[] arr = {1, 2, 300, 4, 50};
        System.out.println(findMinMaxDif(arr));
    }

    /**
     * This method return the difference between the min and max values of the array
     */
    public static int findMinMaxDif(int[] arr) {
        return findMax(arr) - findMin(arr);
    }

    /**
     * This method gets an array and returns the its max value.
     *
     * @param arr An array of ints
     * @return The max value
     */
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int curr : arr) {
            if (curr > max) {
                max = curr;
            }
        }

        return max;
    }

    /**
     * This method gets an array and returns the its min value.
     *
     * @param arr An array of ints
     * @return The min value
     */
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int curr : arr) {
            if (curr < min) {
                min = curr;
            }
        }

        return min;
    }
}
