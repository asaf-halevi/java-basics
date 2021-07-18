package _5_arrays.exe13;

/**
 * Write a Java program that gets an array of integers and figure out if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 * Also – print where is the location.
 * <p>
 * Examples:
 * [1, 1, 1, 2, 1] → true, after element 2
 * [2, 1, 1, 2, 1] → false
 * [10, 10] → true, after element
 *
 * @author Tal Green
 */
public class CanBeSplitted {

    public static void main(String[] args) {
        // true - after element 2
        int[] arr = {1, 1, 1, 2, 1};

        // false
        //int[] arr = { 2, 1, 1, 2, 1 };

        // true - after element 0
        //int[] arr = { 10,10 };

        boolean found = false;    // indicate if split point was found

        // loop to test every possible split point
        for (int splitPoint = 0; splitPoint < arr.length; splitPoint++) {
            int lowIndex = 0;
            int highIndex = arr.length - 1;

            int leftSum = 0;
            int rightSum = 0;

            // calculate the left sum
            while (lowIndex <= splitPoint) {
                leftSum += arr[lowIndex];
                lowIndex++;
            }

            // calculate the right sum
            while (highIndex > splitPoint) {
                rightSum += arr[highIndex];
                highIndex--;
            }

            // compare 2 sums
            if (leftSum == rightSum) {
                found = true;
                System.out.println("True,  after element " + splitPoint);
            }

        }
        if (!found) {
            System.out.println("false");
        }
    }

}
