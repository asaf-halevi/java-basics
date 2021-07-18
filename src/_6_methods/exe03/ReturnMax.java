package _6_methods.exe03;

/**
 * Write a method that gets 2 integers and prints the max number.
 * Write a code that uses this method.
 * <p>
 * Add another method that gets 2 integers and returns the max number.
 *
 * @author Tal Green
 */
public class ReturnMax {

    public static void main(String[] args) {
        printMax(10, 20);

        int x = 5;
        int y = 1;
        int m = returnMax(x, y);
        System.out.println("m=" + m);
    }

    public static void printMax(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    public static int returnMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
