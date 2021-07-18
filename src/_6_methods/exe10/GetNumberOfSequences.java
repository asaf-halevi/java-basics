package _6_methods.exe10;

/**
 * Write a java method that gets an array of integers that contains only 0 and 1.
 * The method should return the number of sequences of 1: Sequence means 1 or more adjacent cells with 1 in them.
 * Note: You can assume that the array starts with 0
 * <p>
 * For example: for this array: {0,0,0,1,1,0,1,1,1,0,0,0,1,0,0,1,0,1,1,1,1};
 * <p>
 * The return value should be: 4.
 *
 * @author Tal Green
 */
public class GetNumberOfSequences {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1};
        //int[] arr = { 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1 };
        //int[] arr = { 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1 ,0};

        System.out.println(getNumOfSequencesNoAssumption(arr));
        System.out.println(getNumberOfSequencesAssumeStartWith0(arr));
    }

    /**
     * This method gets an array of 1 & 0, and returns the number of sequences of 1.
     * It does not assume anything about the array structure.
     *
     * @param arr Array of 1 & 0
     * @return the number of sequences of 1
     */
    public static int getNumOfSequencesNoAssumption(int[] arr) {
        int counter = 0;
        boolean alreadyIn1Sequence = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (!alreadyIn1Sequence) {
                    counter++;
                    alreadyIn1Sequence = true;
                }
            } else // arr[i] == 0
            {
                alreadyIn1Sequence = false;
            }
        }
        return counter;
    }

    /**
     * This method gets an array of 1 & 0, and returns the number of sequences of 1.
     * It assumes that the array starts with 0. All it does is count the times that the current element is 0 and the next is 1.
     *
     * @param arr Array of 1 & 0
     * @return the number of sequences of 1
     */
    public static int getNumberOfSequencesAssumeStartWith0(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 1) {
                counter++;
            }
        }
        return counter;
    }
}
