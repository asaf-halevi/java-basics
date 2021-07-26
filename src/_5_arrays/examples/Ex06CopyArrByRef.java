package _5_arrays.examples;

public class Ex06CopyArrByRef {

    public static void main(String[] args) {
        int[] numbers1 = {1, 5, 87};

        int[] numbers2 = numbers1;

        //numbers2[0] = 100;

        System.out.print("The original array: ");
        for (int number : numbers1) {
            System.out.print(number + " ");
        }

        System.out.print("\nThe copied array  : ");
        for (int number : numbers2) {
            System.out.print(number + " ");
        }
    }
}
