package _6_methods.exe20;

/**
 * Write a Java method that gets a password and checks if the it�s a valid password.
 * <p>
 * The rules for valid password are:
 * - Minimum length of 8 characters
 * -Contains both numbers & letters
 * -Contains at least 1 Uppercase letter
 * -Contains at least 1 lowercase letter
 * -Contains at least 1 special character: ~!@#$%^&*()_
 * <p>
 * For example:
 * Aa123456 � false
 * Aa123456^ - true
 *
 * @author Tal Green
 */
public class ValidatePassword {

    public static void main(String[] args) {
        System.out.println(validatePassword("Aa123456^"));

    }

    /**
     * This method gets a password and validates it according to all the rules.
     *
     * @param pass
     * @return
     */
    public static boolean validatePassword(String pass) {
        return validateMinLenght(pass, 8) &&
                containsDigits(pass) &&
                containsLetters(pass) &&
                containsUppercaseLetter(pass) &&
                containsLowercaseLetter(pass) &&
                containsSpecialChar(pass);
    }

    /**
     * This method gets a password an minimum length and validates that the
     * password length is at least the minimum length.
     *
     * @param pass   The password to validate
     * @param minLen The minimum length
     * @return true if the password length is minimum 'minLen'
     */
    public static boolean validateMinLenght(String pass, int minLen) {
        return pass.length() >= minLen;
    }

    /**
     * Gets a string and returns true if it contains at least 1 digit.
     */
    public static boolean containsDigits(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Gets a string and returns true if it contains at least 1 letter.
     */
    public static boolean containsLetters(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isLetter(ch)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Gets a string and returns true if it contains at least 1 uppercase letter.
     */
    public static boolean containsUppercaseLetter(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Gets a string and returns true if it contains at least 1 lower letter.
     */
    public static boolean containsLowercaseLetter(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Gets a string and returns true if it contains at least 1 special character.
     */
    public static boolean containsSpecialChar(String pass) {
        String specialChars = "~!@#$%^&*()_";

        for (int i = 0; i < pass.length(); i++) {
            char curr = pass.charAt(i);

            if (specialChars.contains(Character.toString(curr))) {
                return true;
            }
        }

        return false;
    }

}
