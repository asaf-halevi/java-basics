package _6_methods.exe07;

/**
 * Create a method that gets an array of integers and an integer, and returns:
 * true: if the integer is found in the array
 * false: if the integer is not found in the array
 *
 * @author Tal Green
 */
public class IsIntegerFound {
    public static void main(String[] args) {
        int[] myIntArray = {12, 55, 80, 147, 7, 233, 590};
        int searchNum = 233;

        if (isIntegerExist(myIntArray, searchNum)) {
            System.out.println("The number '" + searchNum + "' was found");
        } else {
            System.out.println("The number '" + searchNum + "' was not found");
        }
    }

    public static boolean isIntegerExist(int[] arrayOfIntegers, int integerToSearch) {
        boolean isExist = false;
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] == integerToSearch) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }
}
