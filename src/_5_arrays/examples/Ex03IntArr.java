package _5_arrays.examples;

public class Ex03IntArr {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 7, 9, 4, 65, 100, 98, 234};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum is:" + sum);
    }
}
