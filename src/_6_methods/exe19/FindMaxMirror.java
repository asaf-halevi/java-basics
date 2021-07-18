package _6_methods.exe19;

/**
 * We'll say that a "mirror" section in an array is a group of contiguous elements such that
 * somewhere in the array, the same group appears in reverse order.
 * <p>
 * For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
 * <p>
 * Write a Java program that gets an array and return the size of the largest mirror section found in it.
 * Examples:
 * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
 * maxMirror([1, 2, 1, 4]) → 3
 * maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
 *
 * @author Tal Green
 */
public class FindMaxMirror {

    public static void main(String[] args) {

        System.out.println(getMaxMirrorLenght(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(getMaxMirrorLenght(new int[]{1, 2, 1, 4}));
        System.out.println(getMaxMirrorLenght(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }

    /**
     * This method gets an array of integers and return the max mirror length.
     */
    public static int getMaxMirrorLenght(int[] arr) {
        int currMirrorLen = 0;
        int maxMirrorLen = 0;

        for (int i = 0; i < arr.length; i++) {
            currMirrorLen = getMaxMirrorLengthFromIndex(arr, i);
            if (currMirrorLen > maxMirrorLen) {
                maxMirrorLen = currMirrorLen;
            }
        }

        return maxMirrorLen;
    }

    /**
     * This method gets an array of ints and an index.
     * It searches for a mirror that its left side is index.
     * It starts to search from the last element of the array.
     *
     * @param arr   An array of integers
     * @param index Index to start mirror search from
     * @return The lenght of the mirror that starts from the index. If there is no mirror - 0 will be returned
     */
    public static int getMaxMirrorLengthFromIndex(int[] arr, int index) {
        int currMirrorLen = 0;
        int maxMirrorLen = 0;

        int endIndex = arr.length - 1;

        while (index < endIndex) {
            currMirrorLen = getMirrorLengthInRange(arr, index, endIndex);
            if (currMirrorLen > maxMirrorLen) {
                maxMirrorLen = currMirrorLen;
            }

            endIndex--;
        }

        return maxMirrorLen;

    }

    /**
     * This method gets an array of ints and a range.
     * It searches for a mirror that starts in 'from' at the left side and starts with 'to' at the right side.
     * It returns the mirror length.
     * If there is no mirror - 0 will be returned
     *
     * @param arr  The array to search the mirror in
     * @param from The left side of the mirror
     * @param to   The right side of the mirror
     * @return The mirror length. 0 if no mirror found
     */
    public static int getMirrorLengthInRange(int[] arr, int from, int to) {
        int len = 0;

        while (from < arr.length && to >= 0) {
            if (arr[from] == arr[to]) {
                from++;
                to--;
                len++;
            } else {
                break;
            }
        }

        return len;

    }

}
