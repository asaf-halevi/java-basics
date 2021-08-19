package _9_inheritance.exe5.shapes;

public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(Point center, String color, double side1, double side2, double side3) {
        super(center, color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", center=" + center + ", color=" + color + "]";
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public boolean isEquilateral() {
        return (side1 == side2 && side2 == side3);
    }

    public boolean isIsosceles() {
        return (side1 == side2 || side1 == side3 || side2 == side3);
    }
}
