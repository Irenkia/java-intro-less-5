package org.example;

public class Main {
    public static void main(String[] args) {
        forTextFormatter();
    }
    public static void forTextFormatter(){
        CapitalLettersClass capitalLetters = new CapitalLettersClass();
        SmallLettersClass smallLetters = new SmallLettersClass();
        String str = "Hello world!";
        System.out.println("Our String : \"" + str + "\"");
        System.out.println("let's make it all in capital letters : \"" + capitalLetters.formatText(str) + "\"");
        System.out.println("let's make it all in small letters : \"" + smallLetters.formatText(str) + "\"");
    }

}
