package _9_inheritance.exe5.shapes;

/**
 * This class represents a point. It have 2 coordinates: x & y.
 *
 * @author Tal Green
 */
public class Point {
    // membersa
    private double x;
    private double y;

    // constructors
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    // Getters & setters

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
