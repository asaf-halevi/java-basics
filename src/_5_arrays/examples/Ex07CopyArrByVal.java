package _5_arrays.examples;

public class Ex07CopyArrByVal {

    public static void main(String[] args) {
        int[] numbers1 = {1, 5, 87};

        int[] numbers2 = new int[numbers1.length];

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = numbers1[i];
        }

        //        numbers2[0] = 100;

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
