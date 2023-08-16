package shapes;

import base_geometryc.Shape;
import shape_functionality.*;

public class Rectangle extends Shape implements HasPerimeter, HasArea, HasSymbol {
    public static final char symbol = '▬';
    public static final String name = "Rectangle";
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        if (width == 0 || height == 0) {
            throw new IllegalArgumentException(String.format("Прямокутника з шириною %s і висотою %s не існує!", width, height));
        }
        this.width = width;
        this.height = height;
    }

    public Rectangle(Color color, int width, int height) {
        this(width, height);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getName() {
        return name;
    }
}
