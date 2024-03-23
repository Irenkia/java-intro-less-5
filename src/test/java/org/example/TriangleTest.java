package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void shouldAreaTriangle() {
        //given
        Shape triangle = new Triangle(3.0, 5.0, 7.0);

        //when
        double result = triangle.getArea();

        //then
        Assertions.assertEquals(6.5, result);
    }
    @Test
    public void shouldPerimeterTriangle() {
        //given
        Shape triangle = new Triangle(3.0, 5.0, 7.0);

        //when
        double result = triangle.getPerimeter();

        //then
        Assertions.assertEquals(15.0, result);
    }
}
