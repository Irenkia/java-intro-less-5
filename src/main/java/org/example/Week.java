package org.example;

public class Week {
    private Day day;

    public Week() {
    }

    public Week(Day day) {
        this.day = day;
    }

    public String selectDay(Day day){
        switch (day){
            case MONDAY:
                return "MONDAY";
            case TUESDAY:
                return "TUESDAY";
            case WEDNESDAY:
                return "WEDNESDAY";
            case THURSDAY:
                return "THURSDAY";
            case FRIDAY:
                return "FRIDAY";
            case SATURDAY:
                return "SATURDAY";
            case SUNDAY:
                return "SUNDAY";
            default:
                return"There is no such day";
        }
    }

    public void chooseDay(){
        switch (day){
            case MONDAY:
                System.out.println("MONDAY");
                break;
            case TUESDAY:
                System.out.println("TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("THURSDAY");
                break;
            case FRIDAY:
                System.out.println("FRIDAY");
                break;
            case SATURDAY:
                System.out.println("SATURDAY");
                break;
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("There is no such day");
                break;
        }
    }

}
