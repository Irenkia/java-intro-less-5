package org.example;

public class Main {
    public static void main(String[] args) {
        fromShape();
    }
    public static void fromShape(){
        Shape circle = new Circle(4.0);
        System.out.println("Area circle (radius = 4) = " + circle.getArea());
        System.out.println("Perimeter circle (radius = 4) = " + circle.getPerimeter());
        Shape triangle = new Triangle(3.0, 5.0, 7.0);
        System.out.println("Area triangle (cathetus1 = 3, cathetus2 = 5, hypotenuse = 7) = " + triangle.getArea());
        System.out.println("Perimeter triangle (cathetus1 = 3, cathetus2 = 5, hypotenuse = 7) = " + triangle.getPerimeter());
    }
}
