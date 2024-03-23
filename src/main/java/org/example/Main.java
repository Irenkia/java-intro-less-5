package org.example;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        forShape();
    }
    public static void forShape(){
        Shape circle = new Circle(4.0);
        System.out.println("Area circle (radius = 4) = " + circle.getArea());
        System.out.println("Perimeter circle (radius = 4) = " + circle.getPerimeter());
        Shape triangle = new Triangle(3.0, 5.0, 7.0);
        System.out.println("Area triangle (cathetus1 = 3, cathetus2 = 5, hypotenuse = 7) = " + triangle.getArea());
        System.out.println("Perimeter triangle (cathetus1 = 3, cathetus2 = 5, hypotenuse = 7) = " + triangle.getPerimeter());
        Shape square = new Square(3.0);
        System.out.println("Area square (side = 3) = " + square.getArea());
        System.out.println("Perimeter square (side = 3) = " + square.getPerimeter());
        Shape rectangle = new Rectangle(2.0, 4.0);
        System.out.println("Area rectangle (side1 = 2, side2 = 4) = " + rectangle.getArea());
        System.out.println("Perimeter rectangle (sid1 = 2, side2 = 4) = " + rectangle.getPerimeter());
=======
<<<<<<< HEAD
        forEnumDay();
    }
    public static void forEnumDay(){
        Week day = new Week();
        System.out.println(day.selectDay(Day.MONDAY));
        System.out.println(day.selectDay(Day.TUESDAY));
        System.out.println(day.selectDay(Day.WEDNESDAY));
        System.out.println(day.selectDay(Day.THURSDAY));
        System.out.println(day.selectDay(Day.FRIDAY));
        System.out.println(day.selectDay(Day.SATURDAY));
        System.out.println(day.selectDay(Day.SUNDAY));

        System.out.println("\n");
        Week firstDay = new Week(Day.MONDAY);
        firstDay.chooseDay();
        Week secondDay = new Week(Day.TUESDAY);
        secondDay.chooseDay();
        Week thirdDay = new Week(Day.WEDNESDAY);
        thirdDay.chooseDay();
        Week fourthDay = new Week(Day.THURSDAY);
        fourthDay.chooseDay();
        Week fifthDay = new Week(Day.FRIDAY);
        fifthDay.chooseDay();
        Week sixthDay = new Week(Day.SATURDAY);
        sixthDay.chooseDay();
        Week seventhDay = new Week(Day.SUNDAY);
        seventhDay.chooseDay();
=======
        forTriangle();
    }
    public static void forTriangle(){
        Triangle triangle = new Triangle(3.0, 5.0);
        System.out.println(triangle.toString());;
>>>>>>> 906d7028d158e42516f889cd3adfe7ec5640667c
>>>>>>> 65f7b983761de190c1356afde72bb127d9d69f52
    }
}
