package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void shouldAreaRectangle() {
        //given
        Shape rectangle = new Rectangle(2.0, 4.0);

        //when
        double result = rectangle.getArea();

        //then
        Assertions.assertEquals(8.0, result);
    }
    @Test
    public void shouldPerimeterRectangle() {
        //given
        Shape rectangle = new Rectangle(2.0, 4.0);

        //when
        double result = rectangle.getPerimeter();

        //then
        Assertions.assertEquals(12.0, result);
    }
}
