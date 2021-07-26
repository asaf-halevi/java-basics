package _6_methods.exe04;

/**
 * Write a method �isPositive� that gets a number and indicate whether it is positive number by returning a boolean value.
 * Write a code that uses this method.
 * <p>
 * Add another method �isNegative� that returns true if the number is negative. It should use the �isPositive� method.
 *
 * @author Tal Green
 */
public class IsPositive {

    public static void main(String[] args) {
        int x = -5;
        System.out.println("is positive: " + isPositive(x));
        System.out.println("is negative: " + isNegative(x));
    }

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isNegative(int num) {
        return !isPositive(num);
    }

}
