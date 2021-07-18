package _6_methods.exe17;

/**
 * Write a java method that gets an array of integers and returns true if the array contains 2 adjacent elements with 2 in them.
 * <p>
 * For example:
 * For {1,5,2,2,6}	return true
 * For {1,2,9,2,6}	return false
 *
 * @author Tal Green
 */
public class FindAdjacentElements {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 2, 6};

        System.out.println(containsAdjacentElements(arr, 2));

    }

    /**
     * This method gets an array and a numer. It return true if the array contains 2 adjacent elements with the number num in them.
     */
    public static boolean containsAdjacentElements(int[] arr, int num) {
        // Iterate over the array and check each 2 adjacent elements.
        // Because of this we need to iterate until the second element fron the end
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the current 2 elements equals to num. If so - return true
            if (arr[i] == num && arr[i + 1] == num) {
                return true;
            }
        }

        // If we reached this line of code, no adjacent cells were found - return false
        return false;
    }

}
