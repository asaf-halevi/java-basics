package _6_methods.examples;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        System.out.println("Factorial of " + n + " is " + result);
    }

}
