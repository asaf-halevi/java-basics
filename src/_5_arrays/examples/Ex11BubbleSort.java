package _5_arrays.examples;

public class Ex11BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {67, 890, 12, 56, 43, 856};

        System.out.print("Array before sort: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        boolean isSorted = false;
        for (int top = numbers.length - 1; top > 0 && !isSorted; top--) {
            isSorted = true;
            for (int i = 0; i < top; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        System.out.print("Array after sort: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
