package _5_arrays.examples;

public class Ex04IntArrForEach {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 7, 9, 4, 65, 100, 98, 234};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum is:" + sum);
    }
}
