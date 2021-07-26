package _6_methods.examples;

public class Ex04MethodWithParamsAndReturnedValue {
    public static void main(String[] args) {
        int sum = getSum(5, 98);
        System.out.println(sum);
    }

    private static int getSum(int num1, int num2) {
        return num1 + num2;
    }
}
