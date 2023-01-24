package intermediates.util_classes.dates.java8_only;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;

public class Dates {
    public static void main(String[] args) {
        // Date only (dd MM yyyy). Uses ISO.
        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println(LocalDate.of(2023, Month.MAY, 11));
        System.out.println(LocalDate.parse("2023-01-01"));

        System.out.println("Tomorrow: " + now.plusDays(1));
        System.out.println("Yesterday: " + now.minusDays(1));
        System.out.println("After 2 years: " + now.plusYears(2));
        System.out.println("2 years ago: " + now.minus(2, ChronoUnit.YEARS));

        System.out.println("Today: " + now.getDayOfMonth());

        System.out.println("Is " + now.getYear() + " a leap year? " + (now.isLeapYear() ? "Yes!" : "No!"));

        // Only time
        LocalTime hourNow = LocalTime.now();
        System.out.println(hourNow);

        System.out.println(LocalTime.of(11, 25));
        System.out.println(LocalTime.parse("15:25"));

        System.out.println("In 15 minutes -> " + hourNow.plus(15, ChronoUnit.MINUTES));
        System.out.println("40 minutes ago -> " + hourNow.minusMinutes(40));

        // Complete (date and time)
        LocalDateTime todayNow = LocalDateTime.now();
        System.out.println("Today and now: " + todayNow);
        System.out.println("Tomorrow this moment: " + todayNow.plusDays(1));

        System.out.println("Random date and time: " + LocalDateTime.of(1999, 1, 1, 1, 1, 1));

        ZoneId timezone = ZoneId.systemDefault();
        System.out.println("Default timezone: " + timezone);

        /*
        // Get all ids
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        for (String id : availableZoneIds)
            System.out.println(id);
         */

        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        System.out.println("ZoneId of " + sp.getId() + ": " + sp.getDisplayName(TextStyle.FULL, Locale.getDefault()));

        // Using offsets
        ZoneOffset offset = ZoneOffset.of("+02:00");    // Adds 2 hours
        OffsetDateTime offsetDateTime = OffsetDateTime.of(todayNow, offset);

        System.out.println(offsetDateTime); // Adds offset on the date

        // Converting date
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtdate = LocalDateTime.ofInstant(date.toInstant(), sp);

        System.out.println(ldtdate);
    }
}
