import base_geometryc.Shape;
import shape_functionality.Color;
import printer.ConsoleShapePrinter;
import shapes.*;

public class Main {
    public static void testNonExistentTriangles() {
        // Не існує - тому помилка
        Triangle t2 = new Triangle(4, 2, 6);
        // Не існує - тому помилка
        // Triangle t1 = new Triangle("triangle", 1, 1, 1045);
    }

    public static void testNonExistentTrianglesWithArgumentOrder() {
        try {
            // Не існує - тому помилка
            Triangle t1 = new Triangle(2, 1, 1);
            System.out.println("t1.getArea() = " + t1.getArea());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        try {
            // Не існує - тому помилка
            Triangle t2 = new Triangle(1, 2, 1);
            System.out.println("t2.getArea() = " + t2.getArea());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        try {
            // Не існує - тому помилка
            Triangle t3 = new Triangle(1, 1, 2);
            System.out.println("t3.getArea() = " + t3.getArea());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }
    public static void testTriangle() {
        // Не існує - тому помилка
        Triangle t1 = new Triangle(20, 20, 10);

        System.out.println("t1.getPerimeter() = " + t1.getPerimeter());
        System.out.println("t1.getArea() = " + t1.getArea());
    }

    public static void testCircle() {
        Circle circle1 = new Circle(7);
        Circle circle2 = new Circle(6);
        Circle circle3 = new Circle(5);
        System.out.println(circle1);
        ConsoleShapePrinter.printShapeName(circle1);
        System.out.println("circle1.getArea() = " + circle1.getArea());
    }

    public static void testRectangle() {
        Rectangle rect1 = new Rectangle(50, 700);
        ConsoleShapePrinter.printShapeName(rect1);
    }

    public static void testQuad() {
        Square q1 = new Square(20);
        System.out.println("q1.getArea() = " + q1.getArea());
    }

    public static void testBigShapeArr() {
        Shape[] arr = new Shape[100];
        for (int i = 0; i < 100; i++) {
            if (i < 30) {
                arr[i] = new Triangle(1 + i * 2, 1 + i * 3, 1 + (int) (i * 1.5));
            } else if (i < 60) {
                arr[i] = new Rectangle(i * 8, i * 2);
                arr[i].setColor(Color.BLUE);
            } else {
                arr[i] = new Circle(i * 20);
            }
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(" ----------------------- " + i + " ----------------------- ");
            ConsoleShapePrinter.printShape(arr[i]);
        }
    }

    public static void printAllShapeData() {
        Circle circle = new Circle(Color.CYAN, 5);
        Quad quad = new Quad(Color.BLUE, 5, 6, 7, 8);
        Rectangle rectangle = new Rectangle(Color.GREEN_BRIGHT, 5, 2);
        RegularPentagon regularPentagon = new RegularPentagon(Color.RED_BRIGHT, 5);
        Square square = new Square(Color.YELLOW, 5);
        Triangle triangle = new Triangle(Color.WHITE_BRIGHT, 5, 5, 5);

        ConsoleShapePrinter.printShape(circle);
        ConsoleShapePrinter.printShape(quad);
        ConsoleShapePrinter.printShape(rectangle);
        ConsoleShapePrinter.printShape(regularPentagon);
        ConsoleShapePrinter.printShape(square);
        ConsoleShapePrinter.printShape(triangle);
    }

    public static void printShapeName() {
        Circle circle = new Circle(5);
        Quad quad = new Quad(5, 6, 7, 8);
        Rectangle rectangle = new Rectangle(5, 2);
        RegularPentagon regularPentagon = new RegularPentagon(5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 5, 5);

        ConsoleShapePrinter.printShapeName(circle);
        ConsoleShapePrinter.printShapeName(quad);
        ConsoleShapePrinter.printShapeName(rectangle);
        ConsoleShapePrinter.printShapeName(regularPentagon);
        ConsoleShapePrinter.printShapeName(square);
        ConsoleShapePrinter.printShapeName(triangle);
    }

    public static void main(String[] args) {
        printShapeName();
        // printAllShapeData();
        // testNonExistentTrianglesWithArgumentOrder();
    }
}