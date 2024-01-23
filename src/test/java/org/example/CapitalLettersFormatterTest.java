package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapitalLettersFormatterTest {
    @Test
    public void shouldCapitalLettersString() {
        //given
        CapitalLettersFormatter capitalLetters = new CapitalLettersFormatter();
        String str = "Hello world!";

        //when
        String result = capitalLetters.formatText(str);

        //then
        Assertions.assertEquals("HELLO WORLD!", result);
    }
}
