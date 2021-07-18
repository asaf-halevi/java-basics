package _6_methods.exe12;

/**
 * Write a java method that gets an array of integers and returns how many of its elements are even numbers.
 *
 * @author Tal Green
 */
public class CountEven {

    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 4, 50};

        System.out.println(countEven(arr));

    }

    /**
     * This method gets an array of integers and return the count of even elements.
     */
    public static int countEven(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (isEven(num)) {
                count++;
            }
        }

        return count;
    }

    /**
     * This method gets an int and returns if it's an even number.
     */
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
