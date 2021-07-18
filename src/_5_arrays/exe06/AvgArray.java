package _5_arrays.exe06;

/**
 * Write a java program that print the average value of the array elements.
 *
 * @author Tal Green
 */
public class AvgArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The average of all the elements is: " + sum / arr.length);
    }

}
