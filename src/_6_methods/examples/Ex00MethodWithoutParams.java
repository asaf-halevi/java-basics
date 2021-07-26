package _6_methods.examples;

public class Ex00MethodWithoutParams {

    public static void main(String[] args) {
        printChars();
    }

    private static void printChars() {
        for (int i = 0; i < 5; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
