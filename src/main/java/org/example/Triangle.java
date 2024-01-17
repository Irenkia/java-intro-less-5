package org.example;

public class Triangle {
    private double width;
    private double height;

    public Triangle() {
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "\nTriangle{width=" + width + " height=" + height + "}";
    }
}
