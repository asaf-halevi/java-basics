package _5_arrays.exe05;

/**
 * Write a java program that print the sum of values of all the elements.
 *
 * @author Tal Green
 */
public class SumArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of all the elements is: " + sum);
    }

}
