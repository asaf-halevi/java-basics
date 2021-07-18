package _6_methods.exe02;

/**
 * Write a method that gets an integer as parameter and prints line of �*� in the length of the number.
 * Write a code that uses this method.
 * <p>
 * For example: for 5 it should print:
 * ****
 *
 * @author Tal Green
 */
public class PrintLineOfStartsParam {

    public static void main(String[] args) {
        printLineOfStarts(100);
    }

    public static void printLineOfStarts(int lenght) {
        for (int i = 0; i < lenght; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
