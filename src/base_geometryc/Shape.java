package base_geometryc;

import shape_functionality.Color;

public abstract class Shape {
    private Color color = Color.DEFOULT_COLOR;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String getName();

    public Color getColor() {
        return color;
    }
    public String getColorName() {
        return color.name();
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
