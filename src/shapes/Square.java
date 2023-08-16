package shapes;

import base_geometryc.Shape;
import shape_functionality.*;

public class Square extends Shape implements HasPerimeter, HasArea, HasSymbol {
    public static final char symbol = '■';
    public static final String name = "Square";
    public int side;

    public Square(int side) {
        if (side == 0) {
            throw new IllegalArgumentException(String.format("Квадрата зі стороною %s не існує!", side));
        }
        this.side = side;
    }

    public Square(Color color, int side) {
        this(side);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String getName() {
        return name;
    }
}
