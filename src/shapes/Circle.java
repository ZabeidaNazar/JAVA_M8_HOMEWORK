package shapes;

import base_geometryc.Shape;
import shape_functionality.*;

public class Circle extends Shape implements HasPerimeter, HasArea, HasSymbol {
    public static final char symbol = '⏺';
    public static final String name = "Circle";
    public int radius;

    public Circle(int radius) {
        super(name);
        if (radius == 0) {
            throw new IllegalArgumentException(String.format("Кола з радіусом %s не існує!", radius));
        }
        this.radius = radius;
    }

    public Circle(Color color, int radius) {
        this(radius);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
