package shapes;

import base_geometryc.Shape;
import shape_functionality.*;

public class Triangle extends Shape implements HasPerimeter, HasArea, HasSymbol {
    public static final char symbol = '▲';
    public static final String name = "Triangle";
    public int side1;
    public int side2;
    public int side3;

    public Triangle(int side1, int side2, int side3) {
        sideValidate(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(Color color, int side1, int side2, int side3) {
        this(side1, side2, side3);
        this.setColor(color);
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
        sideValidate(side1, this.side2, this.side3);

    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        sideValidate(this.side1, side2, this.side3);
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        sideValidate(this.side1, this.side2, side3);
        this.side3 = side3;
    }

    private void sideValidate(int side1, int side2, int side3) {
        int maxSide = Math.max(Math.max(side1, side2), side3);
        boolean isMaxSide = true;
        int otherSum = 0;
        for (int side : new int[] {side1, side2, side3}) {
            if (side < maxSide) {
                otherSum += side;
            } else if (side == maxSide) {
                if (!isMaxSide) {
                    otherSum += side;
                } else {
                    isMaxSide = false;
                }
            }
        }
        if (!(maxSide < otherSum)) {
            throw new IllegalArgumentException(String.format("Трикутника зі сторонами %s, %s і %s не існує!", side1, side2, side3));
        }
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public String getName() {
        return name;
    }
}
