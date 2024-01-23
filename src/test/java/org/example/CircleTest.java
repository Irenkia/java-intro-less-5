package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void mustCalculateArea() {
        //given
        Shape circle = new Circle(4.0);

        //when
        double result = circle.getArea();

        //then
        Assertions.assertEquals(50.27, result);
    }
    @Test
    public void mustCalculatePerimeter() {
        //given
        Shape circle = new Circle(4.0);

        //when
        double result = circle.getPerimeter();

        //then
        Assertions.assertEquals(25.13, result);
    }
}
