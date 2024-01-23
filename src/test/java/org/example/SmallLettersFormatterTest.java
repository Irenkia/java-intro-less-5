package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallLettersFormatterTest {
    @Test
    public void shouldSmallLettersString() {
        //given
        SmallLettersFormatter smallLetters = new SmallLettersFormatter();
        String str = "Hello world!";

        //when
        String result = smallLetters.formatText(str);

        //then
        Assertions.assertEquals("hello world!", result);
    }

}
