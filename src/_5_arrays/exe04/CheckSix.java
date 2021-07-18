package _5_arrays.exe04;

/**
 * Write a java program that checks if 6 appears as the first or last element in the array:
 * <p>
 * [1, 2, 6] → true
 * [6, 1, 2, 3] → true
 * [13, 6, 1, 2, 3] → false
 *
 * @author Tal Green
 */
public class CheckSix {

    public static void main(String[] args) {
        int[] arr = {60, 10, 26, 100, 100, 6};

        if (arr[0] == 6 || arr[arr.length - 1] == 6) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
