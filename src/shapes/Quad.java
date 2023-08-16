package shapes;

import base_geometryc.Shape;
import shape_functionality.Color;
import shape_functionality.HasPerimeter;

public class Quad extends Shape implements HasPerimeter {
    public static final String name = "Quad";
    public int side1;
    public int side2;
    public int side3;
    public int side4;

    public Quad(int side1, int side2, int side3, int side4) {
        super(name);
        if (side1 == 0 || side2 == 0 || side3 == 0 || side4 == 0) {
            throw new IllegalArgumentException(String.format("Чотирикутника зі сторонами %s, %s, %s і %s не існує!", side1, side2, side3, side4));
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public Quad(Color color, int side1, int side2, int side3, int side4) {
        this(side1, side2, side3, side4);
        this.setColor(color);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3 + side4;
    }
}
