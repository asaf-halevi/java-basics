package _5_arrays.exe07;

/**
 * A Palindromic array is an array that remains the same when reversing it. For example:
 * [1, 6, 1, 6, 1]
 * <p>
 * Write a Java program that checks if an array is Palindromic one.
 *
 * @author Tal Green
 */
public class PalindromicArray {

    public static void main(String[] args) {
        // Palindromic array
        int[] arr = {1, 6, 4, 6, 1};

        // Non-Palindromic array
        //int [] arr = {1,6,4,6,11};

        int lowIndex = 0;
        int highIndex = arr.length - 1;

        boolean isPali = true; // Assuming array is palindromic one, until proven otherwise.

        while (lowIndex <= highIndex) {
            if (arr[lowIndex] != arr[highIndex]) {
                isPali = false;
                break;
            }

            lowIndex++;
            highIndex--;
        }

        if (isPali) {
            System.out.println("The array is Palindromic :)");
        } else {
            System.out.println("The array is not Palindromic...");
        }
    }

}
