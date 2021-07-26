package _6_methods.examples;

public class Ex01MethodWith1Param {

    public static void main(String[] args) {
        printChars(5);
        printChars(15);
        printChars(1);
    }

    private static void printChars(int numOfChars) {
        for (int i = 0; i < numOfChars; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
