package Exercises.Task7;

public class Main {
    public static void main(String[] args) {

        System.out.println("Saturday is holiday? " + Weekday.SATURDAY.isHoliday());
        System.out.println("Monday is holiday? " + Weekday.MONDAY.isHoliday());
        System.out.println("Friday is weekday? " + Weekday.MONDAY.isWeekDay());

        Weekday.TUESDAY.whichIsGreater(Weekday.FRIDAY);
        Weekday.TUESDAY.whichIsGreater(Weekday.TUESDAY);
    }
}
