package _7_exceptions.examples;

public class Ex02UncheckedStackOverflow {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        System.out.println("function a was called");
        b();
        System.err.println("function a was finished");
    }

    private static void b() {
        System.out.println("function b was called");
        a();
        System.err.println("function b was finished");
    }
}
