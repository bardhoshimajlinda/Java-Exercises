package DateAndTimes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimes {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("The current time is " + localTime.getMinute());
        LocalDate localDate = LocalDate.now();
        System.out.println("Date is " + localDate);


        System.out.println("Time is: " + LocalTime.now());
        System.out.println("Date is: " + LocalDate.now());
        System.out.println("Date and time: " + LocalDateTime.now());
        System.out.println("ZoneDateTime: " + ZonedDateTime.now());


        LocalDate localDate1 = LocalDate.of(2012, Month.JANUARY, 10);
        System.out.println(localDate1);

        LocalTime localTime1 = LocalTime.of(5, 30);
        System.out.println(localTime1);

        LocalDateTime localDateTime = LocalDateTime.of(2012, Month.JANUARY, 10, 5, 30);
        System.out.println(localDateTime);

        ZoneId zoneId = ZoneId.of("Europe/Tirane");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2012, 1, 10, 5, 30, 0, 0, zoneId);
        System.out.println(zonedDateTime);

        //manipulating

        localDate1.plus(1, ChronoUnit.DAYS);
        localTime1.plus(1,ChronoUnit.HOURS);
        localDateTime.plusDays(1);
        zonedDateTime.plus(5, ChronoUnit.MONTHS);

        System.out.println(localDate1.format(DateTimeFormatter.ISO_DATE));
    }
}
