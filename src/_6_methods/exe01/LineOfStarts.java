package _6_methods.exe01;

/**
 * Write a method that prints a line full of �*�.
 * Write a code that uses this method.
 *
 * @author Tal Green
 */
public class LineOfStarts {

    public static void main(String[] args) {
        printLineOfStarts();
    }

    public static void printLineOfStarts() {
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
