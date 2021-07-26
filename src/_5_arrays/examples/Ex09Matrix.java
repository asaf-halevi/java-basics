package _5_arrays.examples;

public class Ex09Matrix {
    public static void main(String[] args) {
        int[][] data1 = new int[2][];
        data1[0] = new int[3];
        data1[1] = new int[3];
        data1[0][0] = 1;

        for (int[] nums : data1){
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }

        int[][] data2 = {{1,2,3}, {4,5,6}};
        for (int[] nums : data2){
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }
    }
}
