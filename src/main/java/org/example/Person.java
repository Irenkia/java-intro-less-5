package org.example;

import java.util.Objects;

public class Person {
    private String name;
    private  String surname;
    private int age;

    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this){
            return true;
        }
        if (other == null){
            return false;
        }
        if (other.getClass() != this.getClass()){
            return false;
        }
        Person that = (Person) other;
        return (this.name.equals(that.name)) && (this.surname.equals(that.surname)) && (this.age ==that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname);
    }
}
