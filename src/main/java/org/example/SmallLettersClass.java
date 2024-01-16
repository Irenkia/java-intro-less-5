package org.example;

public class SmallLettersClass implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
