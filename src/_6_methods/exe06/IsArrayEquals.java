package _6_methods.exe06;

/**
 * Write a java method that gets 2 arrays and check if they are the same
 *
 * @author Tal Green
 */
public class IsArrayEquals {
    public static void main(String[] args) {
        String[] arrayA = {"FireTV", "Mobile", "AndroidTV"};
        String[] arrayB = {"FireTV", "Mobile", "AndroidTV"};

        isEqualArray(arrayA, arrayB);

    }

    public static boolean isEqualArray(String[] firstArray, String[] secondArray) {
        boolean isEqual = true;

        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (!firstArray[i].equals(secondArray[i])) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }

        if (isEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
        return isEqual;
    }
}
