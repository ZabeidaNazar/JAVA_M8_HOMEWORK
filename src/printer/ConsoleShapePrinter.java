package printer;

import base_geometryc.Shape;
import shape_functionality.*;

public class ConsoleShapePrinter {
    public static void printShape(Shape shape) {
        printShapeName(shape);
        printShapeSymbol(shape);
        printShapeColor(shape);
        printShapePerimeter(shape);
        printShapeArea(shape);
    }

    public static void printShapeSymbol(Shape shape) {
        if (shape instanceof HasSymbol) {
            System.out.println("Shape symbol is " + shape.getColor() + ((HasSymbol) shape).getSymbol() + Color.RESET);
        } else {
            System.out.println("Shape symbol is: Shape not implements HasSymbol");
        }
    }

    public static void printShapeName(Shape shape) {
        System.out.println("Shape name is " + shape.getName());
    }

    public static void printShapeColor(Shape shape) {
        System.out.println("Shape color is " + shape.getColor() + shape.getColorName() + Color.RESET);
    }

    public static void printShapeArea(Shape shape) {
        if (shape instanceof HasArea) {
            System.out.println("Shape area is " + ((HasArea) shape).getArea());
        } else {
            System.out.println("Shape area is: Shape not implements HasArea");
        }
    }

    public static void printShapePerimeter(Shape shape) {
        if (shape instanceof HasPerimeter) {
            System.out.println("Shape perimeter is " + ((HasPerimeter) shape).getPerimeter());
        } else {
            System.out.println("Shape perimeter is: Shape not implements HasPerimeter");
        }
    }
}
