package _5_arrays.exe02;

/**
 * Write a java program that finds the max value in array of integers.
 * You can fill the array from the code.
 *
 * @author Tal Green
 */
public class FindMax {

    public static void main(String[] args) {
        int[] arr = {5, 10, 26, 4, 100, 30};

        int currentMax = arr[0]; // The current max will be the first element of the array

        for (int i = 1; i < arr.length; i++) // Start from the second element of the array
        {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
        }

        System.out.println("The max value of the array is: " + currentMax);

    }

}
