package _9_inheritance.exe5.shapes;

/**
 * This class represents an abstract shape.
 *
 * @author Tal Green
 */
public class Shape {
    // Members
    protected Point center;
    protected String color;

    // Constructors
    public Shape(Point center, String color) {
        this.center = center;
        this.color = color;
    }

    public Shape() {
        this(new Point(), "White");
    }

    // Getters & Setters

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape [center=" + center + ", color=" + color + "]";
    }

    // Methods

    /**
     * This method returns the area of the shape
     *
     * @return
     */
    public double getArea() {
        return 0;
    }

    /**
     * This method returns the perimeter of the shap.
     *
     * @return
     */
    public double getPerimeter() {
        return 0;
    }

}
