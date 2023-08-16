package shapes;

import base_geometryc.Shape;
import shape_functionality.Color;
import shape_functionality.HasPerimeter;
import shape_functionality.HasSymbol;

public class RegularPentagon extends Shape implements HasPerimeter, HasSymbol {
    public static final char symbol = '⬟';
    public static final String name = "Regular Pentagon";
    public int side;

    public RegularPentagon(int side) {
        super(name);
        if (side == 0) {
            throw new IllegalArgumentException(String.format("П'ятикутника зі сторонами %s не існує!", side));
        }
        this.side = side;
    }

    public RegularPentagon(Color color, int side) {
        this(side);
        this.setColor(color);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public double getPerimeter() {
        return 5 * side;
    }
}
