package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapitalLettersClassTest {
    @Test
    public void shouldCapitalLettersString() {
        //given
        CapitalLettersClass capitalLetters = new CapitalLettersClass();
        String str = "Hello world!";

        //when
        String result = capitalLetters.formatText(str);

        //then
        Assertions.assertEquals("HELLO WORLD!", result);
    }
}
