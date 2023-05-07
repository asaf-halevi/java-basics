package _6_methods.exe16;

import java.util.Arrays;

/**
 * Given an array of strings, return another array of the strings, omitting any string length 4 or more.
 * <p>
 * (["this", "not", "too", "long"]) → ["not", "too"]
 * (["a", "bbb", "cccc"]) → ["a", "bbb"]
 * (["cccc", "cccc", "cccc"]) → []
 *
 * @author Tal Green
 */
public class RemoveByLen {

    public static void main(String[] args) {
        String[] arr = {"this", "not", "too", "long"};
        //		String[] arr = { "a", "bbb", "cccc" };
        //		String[] arr = { "cccc", "cccc", "cccc", "cccc" };

        String[] res = removeLongElements(arr, 4);

        System.out.println(Arrays.toString(res));

    }

    /**
     * Gets an array of strings and a length. Will return another array of the strings, omitting any string with length equals or bigger then len.
     */
    public static String[] removeLongElements(String[] arr, int len) {
        int numOfElementsToRemove = getNumOfElementsByLength(arr, len);
        int newArrayLen = arr.length - numOfElementsToRemove;

        String[] res = new String[newArrayLen];

        int newArrayIndex = 0;

        for (String curr : arr) {
            if (curr.length() < len) {
                res[newArrayIndex++] = curr;
            }
        }

        return res;
    }

    /**
     * Counts the number of elements that their length is equal or greater then len.
     *
     * @param arr An array of string
     * @param len Length to search for
     * @return The number of elements in the array that their length is equal or greater then len
     */
    public static int getNumOfElementsByLength(String[] arr, int len) {
        int count = 0;

        for (String curr : arr) {
            if (curr.length() >= len) {
                count++;
            }
        }

        return count;
    }

}
