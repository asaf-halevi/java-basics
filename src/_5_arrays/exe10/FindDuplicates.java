package _5_arrays.exe10;

/**
 * Write a Java program to find the duplicate values of an array of integer values.
 * <p>
 * For example: for the array {1,2,1,3,3,9} the output should be:
 * 1
 * 3
 * <p>
 * Note: You can print the same number more than once.
 *
 * @author Tal Green
 */
public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 3, 9, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

    }

}
