package _6_methods.exe11;

/**
 * Write a java method that gets an array of integers and returns the second largest element in the array.
 *
 * @author Tal Green
 */
public class SecondLarge {

    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 4, 5};

        System.out.println(getSecondLargestNumber(arr));

    }

    /**
     * This method gets an array of integers and return the second largest number in it.
     *
     * @param arr Array of integers
     * @return The second largest number in the array
     */
    public static int getSecondLargestNumber(int[] arr) {
        int max = arr[0];        // Will hold the max value
        int secondMax = max;    // Will hold the second largest value

        for (int curr : arr) {
            if (curr > max)    // If the current element if bigger then the current max - update both max and second max
            {
                secondMax = max;
                max = curr;
            } else if (curr > secondMax)    // If the current element is bigger only from the second max - update only it.
            {
                secondMax = curr;
            }
        }

        return secondMax;
    }

}
