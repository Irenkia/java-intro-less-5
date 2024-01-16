package org.example;

public class CapitalLettersClass implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
