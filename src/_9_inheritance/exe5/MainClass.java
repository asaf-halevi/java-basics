package _9_inheritance.exe5;

import _9_inheritance.exe5.shapes.*;
import _9_inheritance.exe5.table.DrawingTable;

public class MainClass {

    public static void main(String[] args) {
        DrawingTable table = new DrawingTable();
        table.addShape(new Circle(new Point(10, 22), "Blue", 33));
        table.addShape(new Rectangle(new Point(10, 22), "Blue", 10, 20));

        table.addShape(new Triangle(new Point(1, 2), "blue", 4, 4, 4));

        Shape s = new Shape();

        System.out.println(table);
    }

}
