package Exercises.Task7;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    public void whichIsGreater(Weekday weekday) {
        if (this.ordinal() < weekday.ordinal()) {
            System.out.println("Before " + weekday);
        } else {
            System.out.println("After " + weekday);
        }
    }
}

