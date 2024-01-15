package org.example;

public class Main {
    public static void main(String[] args) {
        forShape();
    }
    public static void forShape(){
        Shape circle = new Circle(4.0);
        System.out.println("Area circle (radius = 4) = " + circle.getArea());
        System.out.println("Perimeter circle (radius = 4) = " + circle.getPerimeter());
        Shape triangle = new Triangle(3.0, 5.0, 7.0);
        System.out.println("Area triangle (cathetus1 = 3, cathetus2 = 5, hypotenuse = 7) = " + triangle.getArea());
        System.out.println("Perimeter triangle (cathetus1 = 3, cathetus2 = 5, hypotenuse = 7) = " + triangle.getPerimeter());
        Shape square = new Square(3.0);
        System.out.println("Area square (side = 3) = " + square.getArea());
        System.out.println("Perimeter square (side = 3) = " + square.getPerimeter());
        Shape rectangle = new Rectangle(2.0, 4.0);
        System.out.println("Area rectangle (side1 = 2, side2 = 4) = " + rectangle.getArea());
        System.out.println("Perimeter rectangle (sid1 = 2, side2 = 4) = " + rectangle.getPerimeter());
    }
}
