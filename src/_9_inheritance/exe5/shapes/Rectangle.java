package _9_inheritance.exe5.shapes;

public class Rectangle extends Shape {
    private double lenght;
    private double width;

    public Rectangle(Point center, String color, double lenght, double width) {
        super(center, color);
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle [lenght=" + lenght + ", width=" + width + ", center=" + center + ", color=" + color + "]";
    }

    @Override
    public double getArea() {
        return lenght * width;
    }

    @Override
    public double getPerimeter() {
        return (lenght + width) * 2;
    }

    /**
     * This method returns true if this rectangle is a square.
     *
     * @return
     */
    public boolean isSquare() {
        return (lenght == width);
    }

}
