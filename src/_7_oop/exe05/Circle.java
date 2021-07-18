package _7_oop.exe05;

/**
 * Create a class “Circle”. It should have the following members:
 * - int radius
 * - String color
 * Default values: 1 & red.
 * <p>
 * Add get & set methods.
 * <p>
 * Add the following methods:
 * getCircumference() – returns the circumference (הקיף)
 * getArea() – returns the area (שטח)
 * <p>
 * After each step – write a main code that uses the class.
 *
 * @author Tal Green
 */
public class Circle {
    private int m_radius;
    private String m_color;

    public Circle() {
        m_radius = 1;
        m_color = "Red";
    }

    public Circle(int radius, String color) {
        m_radius = radius;
        m_color = color;
    }

    public int getRadius() {
        return m_radius;
    }

    public void setRadius(int radius) {
        m_radius = radius;
    }

    public String getColor() {
        return m_color;
    }

    public void setColor(String color) {
        m_color = color;
    }

    public double getCircumference() {
        return 2 * Math.PI * m_radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(m_radius, 2);
    }
}
