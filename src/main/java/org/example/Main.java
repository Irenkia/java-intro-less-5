package org.example;

public class Main {
    public static void main(String[] args) {
        forTriangle();
    }
    public static void forTriangle(){
        Triangle triangle = new Triangle(3.0, 5.0);
        System.out.println(triangle.toString());;
    }
}
