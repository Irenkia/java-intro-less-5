package org.example;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double s = Math.PI * radius * radius;
        double roundedS = Math.round(s * 100.0) / 100.0;
        return roundedS;
    }

    @Override
    public double getPerimeter() {
        double p = 2 * Math.PI * radius;
        double roundedP = Math.round(p * 100.0) / 100.0;
        return roundedP;
    }
}
