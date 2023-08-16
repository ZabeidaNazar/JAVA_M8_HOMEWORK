package base_geometryc;

import shape_functionality.Color;

public abstract class Shape {
    private String name;

    private Color color = Color.DEFOULT_COLOR;

    public Shape(String name) {
        this.name = name;
    }

    public Shape(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }
    public String getColorName() {
        return color.name();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void printName() {
        System.out.println("Shape name is " + name);
    }

    public void printShapeColor() {
        System.out.println("Shape color is " + color.name());
    }
}
