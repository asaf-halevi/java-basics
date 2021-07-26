package _6_methods.examples;

public class BubbleSortWithMethods {

    public static void main(String[] args) {
        int[] numbers = {67, 890, 12, 56, 43, 856};
        printArray(numbers, "Array before sort: ");
        sortArray(numbers);
        printArray(numbers, "Array after sort: ");
    }

    private static void printArray(int[] numbers, String s) {
        System.out.print(s);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    private static void sortArray(int[] numbers) {
        boolean isSorted = false;
        for (int top = numbers.length - 1; top > 0 && !isSorted; top--) {
            isSorted = true;
            for (int i = 0; i < top; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapElements(numbers, i);
                    isSorted = false;
                }
            }
        }
    }

    private static void swapElements(int[] numbers, int i) {
        int temp = numbers[i];
        numbers[i] = numbers[i + 1];
        numbers[i + 1] = temp;
    }
}
