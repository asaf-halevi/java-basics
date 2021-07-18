package _6_methods.exe05;

/**
 * Create a method that takes three numbers and returns the largest value, use the Math.max().
 * Write a code that uses this method.
 *
 * @author Tal Green
 */
public class MaxOfThree {

    public static void main(String[] args) {
        System.out.println("Max: " + returnMax(5, 100, -6));
    }

    public static int returnMax(int num1, int num2, int num3) {
        int max;
        int tempMax;

        tempMax = Math.max(num1, num2); // tempMax holds the max number between num1 & num2.
        max = Math.max(tempMax, num3);    // max will hold the max number between tempMax & num3 - this is the result.

        return max;

        // Can be done in 1 line:
        // return Math.max(Math.max(num1, num2),num3);
    }

}
