package _6_methods.exe09;

/**
 * Write a Java method that gets an array of integers and returns
 * how many times the maximum number appears.
 * <p>
 * For example: For this array {1,4,2,10,2,10,2} The return value should be 2 (10 appears 2 times)
 *
 * @author Tal Green
 */
public class CountInstancesOfMaxValue1Method {
    public static void main(String[] args) {
        int[] classGrades = {65, 90, 45, 90, 66, 80, 55, 90, 62, 73};

        System.out.println(getNumOfMax(classGrades));
    }

    /**
     * This method gets an array of ints and return how many times the maximum number appears.
     *
     * @param numberArray An array of ints
     * @return how many times the maximum number appears in the array
     */
    public static int getNumOfMax(int[] numberArray) {
        int max = numberArray[0];
        int counter = 1;

        for (int i = 1; i < numberArray.length; i++) {
            // The current element is the new max
            if (numberArray[i] > max) {
                max = numberArray[i];
                counter = 1;
            } else if (numberArray[i] == max) // The current element equals the current max
            {
                counter++;
            }
        }
        return counter;
    }
}
