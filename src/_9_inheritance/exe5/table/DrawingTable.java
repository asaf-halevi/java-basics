package _9_inheritance.exe5.table;

import _9_inheritance.exe5.shapes.Rectangle;
import _9_inheritance.exe5.shapes.Shape;
import _9_inheritance.exe5.shapes.Triangle;

public class DrawingTable {
    public static final int MAX_SHAPE_COUNT = 10;

    private Shape[] shapes = new Shape[MAX_SHAPE_COUNT];
    private int numOfShapes = 0;

    public void addShape(Shape shape) {
        if (numOfShapes == MAX_SHAPE_COUNT - 1) {
            throw new RuntimeException("The drawing table is full.");
        }

        shapes[numOfShapes++] = shape;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < numOfShapes; i++) {
            Shape curr = shapes[i];
            res += curr + "\n";
            res += "Area: " + curr.getArea() + "\n";
            res += "Perimeter: " + curr.getPerimeter() + "\n";

            if (curr instanceof Rectangle) {
                res += "Is square: " + ((Rectangle) curr).isSquare() + "\n";
            }

            if (curr instanceof Triangle) {
                if (((Triangle) curr).isEquilateral()) {
                    res += "The triangle is equilateral" + "\n";
                } else if (((Triangle) curr).isIsosceles()) {
                    res += "The triangle is isosceles" + "\n";
                }

            }
            res += "---------------------------------------------------\n";
        }
        return res;
    }

}
