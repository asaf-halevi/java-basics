package _5_arrays.exe14;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
 * The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
 * <p>
 * [1, 2, 4, 6], [2, 4] → true
 * [1, 2, 4, 6], [2, 3, 4] → false
 * [1, 2, 4, 4, 6], [2, 6] → true
 *
 * @author Tal Green
 */
public class InnerOuter {

    public static void main(String[] args) {
        int[] outer = {1, 2, 4, 6};
        int[] inner = {2, 6};

        int outerIndex = 0;
        int innerIndex = 0;

        // Loop while the indexes are inside the arrays
        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] < inner[innerIndex]) {
                outerIndex++;
            } else if (outer[outerIndex] == inner[innerIndex]) {
                outerIndex++;
                innerIndex++;
            } else // outer[outerIndex] > inner[innerIndex]
            {
                break;
            }

        }

        System.out.println(innerIndex == inner.length);
    }

}
