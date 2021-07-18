package _9_inheritance.exe5.shapes;

public class Circle extends Shape {
    private double radius;

    // Constructors

    public Circle(Point center, String color, double radius) {
        super(center, color);
        this.radius = radius;
    }

    public Circle() {
        this(new Point(), "White", 1);
    }

    public double getRadius() {
        return radius;
    }

    // Getters & Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", center=" + center + ", color=" + color + "]";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
