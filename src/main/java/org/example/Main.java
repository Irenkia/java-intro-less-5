package org.example;

public class Main {
    public static void main(String[] args) {
        forAnimal();
    }
    public static void forAnimal(){
        Animal dog = new Dog("Toby");
        Animal cat = new Cat("Lola");
        System.out.println("Our dog's name is " + dog.getName());
        System.out.println("Our cat's name is " + cat.getName());
    }
}
