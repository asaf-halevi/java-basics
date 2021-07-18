package _4_flow_control.exe16;

/**
 * Write a java program that simulates the game �7 Boom�:
 * It should print all the integer numbers between 1 and 100.
 * If the current number is a multiplication of 7 (7, 14, 21 �)� it should print �Boom� instead of the number.
 * For example:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * Boom
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * Boom
 * 15
 * .
 * .
 *
 * @author Tal Green
 */
public class SevenBoom {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }

    }

}
