package _5_arrays.examples;

import java.util.Arrays;

public class Ex12ArraySort {
    public static void main(String[] args) {
        int[] numbers = {67, 890, 12, 56, 43, 856};

        System.out.print("Array before sort: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        Arrays.sort(numbers);

        System.out.print("Array after sort: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n");
    }
}
