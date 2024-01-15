package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void shouldAreaSquare() {
        //given
        Shape square = new Square(3.0);

        //when
        double result = square.getArea();

        //then
        Assertions.assertEquals(9.0, result);
    }
    @Test
    public void shouldPerimeterSquare() {
        //given
        Shape square = new Square(3.0);

        //when
        double result = square.getPerimeter();

        //then
        Assertions.assertEquals(12.0, result);
    }
}
