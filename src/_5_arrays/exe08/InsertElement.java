package _5_arrays.exe08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program that inserts a new element in to an array (at specific place).
 * <p>
 * Example: for the array [1, 3, 5, 9]
 * new element 10 and position 2, the new array should be:
 * [1, 3, 10, 5]
 *
 * @author Tal Green
 */
public class InsertElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9};
        int insertIndex;
        int newValue;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter insert index: ");
        insertIndex = in.nextInt();

        System.out.print("Enter new value: ");
        newValue = in.nextInt();

        // Check that the insert location is valid
        if (insertIndex < 0 || insertIndex > arr.length - 1) {
            System.out.println("Invalid insert index. Aborting.");
            System.exit(-1);
        }

        int currIndex = arr.length - 1;

        while (true) {
            if (currIndex == insertIndex) {
                arr[currIndex] = newValue;
                break;
            }
            arr[currIndex] = arr[currIndex - 1];
            currIndex--;
        }

        System.out.println(Arrays.toString(arr));

    }

}
