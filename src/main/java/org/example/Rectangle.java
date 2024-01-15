package org.example;

public class Rectangle extends Square{
    private double side2;
    public Rectangle() {
    }

    public Rectangle(double side1, double side2) {
        super(side1);
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return getSide() * side2;
    }

    @Override
    public double getPerimeter() {
        return (getSide() + side2) * 2;
    }
}
