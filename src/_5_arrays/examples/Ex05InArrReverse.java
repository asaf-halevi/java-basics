package _5_arrays.examples;

public class Ex05InArrReverse {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 7, 9, 4, 65, 100, 98, 234};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
