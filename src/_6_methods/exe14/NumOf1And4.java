package _6_methods.exe14;

/**
 * Write a java method that gets an array of integers and returns true if the number 1 appears more times then the number 4.
 *
 * @author Tal Green
 */
public class NumOf1And4 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 6, 1};
        System.out.println(isNumOf1BiggerThenNumOf4(arr));

    }

    /**
     * This method gets an array and returns true if the number 1 appears more times then the number 4 in the array.
     */
    public static boolean isNumOf1BiggerThenNumOf4(int[] arr) {
        return getCountOfNumber(arr, 1) > getCountOfNumber(arr, 4);
    }

    /**
     * This method gets an array and an int. It returns the nunmber of time the int found in the array.
     *
     * @param arr        An array of ints.
     * @param numToCount an int number
     * @return The number of times the integer is found in the array
     */
    public static int getCountOfNumber(int[] arr, int numToCount) {
        int count = 0;

        for (int curr : arr) {
            if (curr == numToCount) {
                count++;
            }
        }

        return count;
    }
}
