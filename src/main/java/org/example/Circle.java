package org.example;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        double roundedS = Math.round(area * 100.0) / 100.0;
        return roundedS;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        double roundedP = Math.round(perimeter * 100.0) / 100.0;
        return roundedP;
    }
}
