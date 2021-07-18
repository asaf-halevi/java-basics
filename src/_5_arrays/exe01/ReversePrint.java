package _5_arrays.exe01;

/**
 * Print an array in reverse order.
 *
 * @author Tal Green
 */
public class ReversePrint {

    public static void main(String[] args) {
        String[] sentence = {"let", "my", "people", "go"};

        for (int i = sentence.length - 1; i >= 0; i--) {
            System.out.println(sentence[i]);
        }
    }

}
