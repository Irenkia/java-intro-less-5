package org.example;

public class SmallLettersFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {

        return text.toLowerCase();
    }
}
