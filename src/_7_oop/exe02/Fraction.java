package _7_oop.exe02;

/**
 * Define the class �Fraction�.
 * Add the following fields:
 * - Numerator
 * - Denumerator
 * Add set & get methods for each field.
 * Add �print� method for printing the fraction (like: 2/3).
 * <p>
 * After each step � write a main code that uses the class.
 */

public class Fraction {
    private int m_numerator = 0;
    private int m_denumerator = 1;

    // Get & Set methods

    public int getNumerator() {
        return m_numerator;
    }

    public void setNumerator(int numerator) {
        m_numerator = numerator;
    }

    public int getDenumerator() {
        return m_denumerator;
    }

    public void setDenumerator(int denumerator) {
        m_denumerator = denumerator;
    }

    // Prints the fraction
    public void print() {
        System.out.println(m_numerator + "/" + m_denumerator);
    }

}
