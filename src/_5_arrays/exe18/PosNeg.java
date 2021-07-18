package _5_arrays.exe18;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program the reads an array length from the user and then reads all the array values from the user. *
 * <p>
 * Then, the program should copy all positive values to �positive� array and all negative values to �negative� array.
 * <p>
 * Notes:
 * All the 3 can have the same length.
 * Empty elements at any array should have 0 in them.
 *
 * @author Tal Green
 */
public class PosNeg {

    public static void main(String[] args) {
        int[] allNumbers;
        int[] posNumbers;
        int[] negNumbers;
        int len;

        int posIndex = 0;
        int negIndex = 0;

        Scanner in = new Scanner(System.in);

        // Read array lenght
        System.out.println("Please enter the array lenght: ");
        len = in.nextInt();

        // Init all arrays
        allNumbers = new int[len];
        posNumbers = new int[len];
        negNumbers = new int[len];

        // Read numbers for all numbers array
        for (int i = 0; i < len; i++) {
            System.out.println("Please enter nubmer (" + (i + 1) + "/" + len + "): ");
            allNumbers[i] = in.nextInt();
        }

        // Iterate over all numbers array and copy numbers to the other 2 arrays
        for (int i = 0; i < len; i++) {
            int cur = allNumbers[i];
            if (cur >= 0) // The current number is positive - copy to pos array and increase posIndex by 1
            {
                posNumbers[posIndex] = cur;
                posIndex++;
            } else // The current number is negative - copy to neg array and increase negIndex by 1
            {
                negNumbers[negIndex] = cur;
                negIndex++;
            }
        }

        System.out.println("Positive Array:");
        System.out.println(Arrays.toString(posNumbers));

        System.out.println("Negative Array:");
        System.out.println(Arrays.toString(negNumbers));
    }

}
