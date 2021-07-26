package _5_arrays.exe02;

public class FindMax2 {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 26, 4, 100, 30};

        int currentMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            currentMax = Math.max(currentMax, num);
        }

        System.out.println("The max value of the array is: " + currentMax);

    }
}
