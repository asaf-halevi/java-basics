package _6_methods.exe08;

/**
 * Create a method that gets an array of strings and a string, and returns the index of the element that contains the string.
 * If the string is not found in the array, it should return -1.
 * <p>
 * For example:
 * For {"Blue", "Red", "White", "Green"} and �Red�, the result is 1.
 *
 * @author Tal Green
 */
public class GetArrayIndex {
    public static void main(String[] args) {
        String[] myColors = {"Blue", "Red", "Green", "White", "Pink", "Black"};
        String searchColor = "White";

        int arrayIndex = getArryIndexByValue(myColors, searchColor);
        if (arrayIndex < 0) {
            System.out.println("The color '" + searchColor + "' was not found.");
        } else {
            System.out.println("The color '" + searchColor + "' with index '" + arrayIndex + "' was found");
        }
    }

    public static int getArryIndexByValue(String[] arrayOfValues, String searchValue) {
        for (int i = 0; i < arrayOfValues.length; i++) {
            if (arrayOfValues[i].equals(searchValue)) {
                return i;
            }
        }
        return -1;
    }
}
