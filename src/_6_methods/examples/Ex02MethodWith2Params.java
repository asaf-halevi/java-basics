package _6_methods.examples;

public class Ex02MethodWith2Params {

    public static void main(String[] args) {
        printChars(5, '*');
        printChars(15, '$');
    }

    private static void printChars(int numOfChars, char charToPrint) {
        for (int i = 0; i < numOfChars; i++) {
            System.out.print(charToPrint);
        }
        System.out.println();
    }
}
