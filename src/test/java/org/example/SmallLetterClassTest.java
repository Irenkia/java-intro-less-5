package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallLetterClassTest {
    @Test
    public void shouldSmallLettersString() {
        //given
        SmallLettersClass smallLetters = new SmallLettersClass();
        String str = "Hello world!";

        //when
        String result = smallLetters.formatText(str);

        //then
        Assertions.assertEquals("hello world!", result);
    }
}
