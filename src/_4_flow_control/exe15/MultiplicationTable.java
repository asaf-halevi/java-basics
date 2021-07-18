package _4_flow_control.exe15;

/**
 * Write a java program that prints the multiplication table (לוח הכפל) up to 10.
 * <p>
 * Hints:
 * Use 2 loops
 * The code “System.out.print(“…”);” will print but will not go to the next line
 * The code “System.out.println();” will print empty line.
 * The string “\t” will print tab character.
 *
 * @author Tal Green
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print("\t"); // Prints tab after each number - for better formatting
            }
            System.out.println(); // go to next line
        }

    }

}
