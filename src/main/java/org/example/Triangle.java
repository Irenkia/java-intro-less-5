package org.example;

public class Triangle implements Shape{
    private double cathetus1;
    private double cathetus2;
    private double hypotenuse;

    public Triangle(double cathetus1, double cathetus2, double hypotenuse) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        double perimeter = (cathetus1 + cathetus2 + hypotenuse) / 2;
        double area = Math.sqrt(perimeter * (perimeter - cathetus1) * (perimeter - cathetus2) * (perimeter - hypotenuse));
        double roundedS = Math.round(area * 100.0) / 100.0;
        return roundedS;
    }

    @Override
    public double getPerimeter() {
        return cathetus1 + cathetus2 + hypotenuse;
    }
}
