package org.example;

public class Main {
    public static void main(String[] args) {
        forMessage();
    }
    public static void forMessage(){
        WindowMessage winMes = new WindowMessage();
        System.out.println(winMes.getMessage());
        ConsoleMessage conMes = new ConsoleMessage();
        System.out.println(conMes.getMessage());
    }

}
