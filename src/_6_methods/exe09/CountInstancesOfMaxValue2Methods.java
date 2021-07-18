package _6_methods.exe09;

/**
 * Write a Java method that gets an array of integers and returns
 * how many times the maximum number appears.
 * <p>
 * For example: For this array {1,4,2,10,2,10,2} The return value should be 2 (10 appears 2 times)
 *
 * @author Tal Green
 */
public class CountInstancesOfMaxValue2Methods {
    public static void main(String[] args) {
        int[] classGrades = {65, 90, 45, 90, 66, 80, 55, 90, 62, 73};

        System.out.println(getNumOfMax(classGrades));
    }

    /**
     * This method gets an array of ints and return the max value.
     *
     * @param numberArray An array if ints
     * @return The max value of the array
     */
    public static int getMaxValue(int[] numberArray) {
        int maxValue = numberArray[0];
        for (int i = 1; i < numberArray.length; i++) {
            if (numberArray[i] > maxValue) {
                maxValue = numberArray[i];
            }
        }
        return maxValue;
    }

    /**
     * This method gets an array of ints and return how many times the maximum number appears.
     *
     * @param numberArray An array of ints
     * @return how many times the maximum number appears in the array
     */
    public static int getNumOfMax(int[] numberArray) {
        int counterValue = 0;
        int valueToCount = getMaxValue(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == valueToCount) {
                counterValue++;
            }
        }
        return counterValue;
    }
}
