package org.example;

public class CapitalLettersFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
