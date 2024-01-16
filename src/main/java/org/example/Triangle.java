package org.example;

public class Triangle implements Shape{
    double cathetus1;
    double cathetus2;
    double hypotenuse;

    public Triangle() {
    }

    public Triangle(double cathetus1, double cathetus2, double hypotenuse) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        double p = (cathetus1 + cathetus2 + hypotenuse) / 2;
        double s = Math.sqrt(p * (p - cathetus1) * (p - cathetus2) * (p - hypotenuse));
        double roundedS = Math.round(s * 100.0) / 100.0;
        return roundedS;
    }

    @Override
    public double getPerimeter() {
        return cathetus1 + cathetus2 + hypotenuse;
    }
}
