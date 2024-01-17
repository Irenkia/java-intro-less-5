package org.example;

<<<<<<< HEAD
public class Triangle extends Shape{
    double cathetus1;
    double cathetus2;
    double hypotenuse;
=======
public class Triangle {
    private double width;
    private double height;
>>>>>>> 65f7b983761de190c1356afde72bb127d9d69f52

    public Triangle() {
    }

<<<<<<< HEAD
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
=======
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "\nTriangle{width=" + width + " height=" + height + "}";
>>>>>>> 65f7b983761de190c1356afde72bb127d9d69f52
    }
}
