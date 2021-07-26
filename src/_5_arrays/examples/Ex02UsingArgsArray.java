package _5_arrays.examples;

public class Ex02UsingArgsArray {
    public static void main(String[] args) {
        System.out.println("The number of words is " + args.length);
        System.out.print("The entire text is: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
