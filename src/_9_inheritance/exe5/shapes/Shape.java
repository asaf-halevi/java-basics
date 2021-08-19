package _9_inheritance.exe5.shapes;

public class Shape {

    protected Point center;
    protected String color;

    public Shape(Point center, String color) {
        this.center = center;
        this.color = color;
    }

    public Shape() {
        this(new Point(), "White");
    }

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

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

}
