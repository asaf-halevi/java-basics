package _6_methods.examples;

public class Ex05MethodThatCallsAnotherMethod {

    public static void main(String[] args) {
        String text = getTextByNum(0);
        System.out.println(text);
    }

    private static String getTextByNum(int num) {
        String result;
        if (num > 0) {
            result = getTextForPositive();
        } else if (num == 0) {
            result = getTextForZero();
        } else {
            result = getTextForNegative();
        }
        return num + " is " + result;
    }

    private static String getTextForPositive() {
        return "positive";
    }

    private static String getTextForZero() {
        return "zero";
    }

    private static String getTextForNegative() {
        return "negative";
    }
}
