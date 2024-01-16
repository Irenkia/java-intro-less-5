package org.example;

public class Main {
    public static void main(String[] args) {
        forPerson();
    }
    public static void forPerson(){
        Person firstPerson = new Person("Stefan", "Cooper", 25);
        Person secondPerson = new Person("Stefan", "Cooper", 25);
        Person thirdPerson = new Person("Samuel", "Terry", 25);
        Person fourthPerson = new Person("Stefan", "Cooper", 35);

        System.out.println("1  :  " + firstPerson.toString());
        System.out.println("2  :  " + secondPerson.toString());
        System.out.println("3  :  " + thirdPerson.toString());
        System.out.println("4  :  " + fourthPerson.toString());

        System.out.println("equals() :");
        System.out.println("1 == 1 :  " + firstPerson.equals(firstPerson));
        System.out.println("1 == 2 :  " + firstPerson.equals(secondPerson));
        System.out.println("1 == 3 :  " + firstPerson.equals(thirdPerson));
        System.out.println("1 == 4 :  " + firstPerson.equals(fourthPerson));

        int hashCode1 = firstPerson.hashCode();
        int hashCode2 = secondPerson.hashCode();
        int hashCode3 = thirdPerson.hashCode();
        int hashCode4 = fourthPerson.hashCode();
        
        System.out.println("hashCode() :");
        System.out.println("1 == 1 :  " + (hashCode1 == hashCode1));
        System.out.println("1 == 2 :  " + (hashCode1 == hashCode2));
        System.out.println("1 == 3 :  " + (hashCode1 == hashCode3));
        System.out.println("1 == 4 :  " + (hashCode1 == hashCode4));
    }
}
