package _7_oop.exe03;

/**
 * Create a class �Pair�. It should have 2 integer members: num1 & num2.
 * Add get & set methods.
 * Add the following methods:
 * printSum() � prints the sum of the 2 numbers
 * getSum() � returns the sum of the 2 numbers.
 * getMax() � returns the max number
 * <p>
 * After each step � write a main code that uses the class.
 *
 * @author Tal Green
 */
public class Pair {
    private int m_num1 = 0;
    private int m_num2 = 0;

    // Getters & Setters
    public int getNum1() {
        return m_num1;
    }

    public void setNum1(int num1) {
        m_num1 = num1;
    }

    public int getNum2() {
        return m_num2;
    }

    public void setNum2(int num2) {
        m_num2 = num2;
    }

    public void printSum() {
        System.out.println("The sum is: " + (m_num1 + m_num2));
    }

    public int getSum() {
        return m_num1 + m_num2;
    }

    public int getMax() {
        return Math.max(m_num1, m_num2);
    }

}
