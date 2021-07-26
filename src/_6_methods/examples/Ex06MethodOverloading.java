package _6_methods.examples;

public class Ex06MethodOverloading {
    public static void main(String[] args) {
        int sum;

        sum = getAllTogether(5, 98);
        System.out.println(sum);

        sum = getAllTogether(5, 98, 78);
        System.out.println(sum);

        sum = getAllTogether(1, 1, 1, 1, 1, 10);
        System.out.println(sum);

        String text = getAllTogether("11", "22");
        System.out.println(text);
    }

    private static int getAllTogether(int num1, int num2) {
        return num1 + num2;
    }

    private static int getAllTogether(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    private static int getAllTogether(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static String getAllTogether(String text1, String text2) {
        return text1 + text2;
    }
}
