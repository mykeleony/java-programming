package intermediates.util_classes.dates;

import java.util.Calendar;
import java.util.Locale;

public class CalendarClassExamples {

    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();     // Singleton

        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH) + 1;
        int day = today.get(Calendar.DAY_OF_MONTH);
        int hour = today.get(Calendar.HOUR_OF_DAY);
        int minute = today.get(Calendar.MINUTE);
        int second = today.get(Calendar.SECOND);

        System.out.printf("Date of today: %02d/%02d/%d", day, month, year);
        System.out.println();
        System.out.printf("Moment: %02d:%02d:%02d", hour, minute, second);
        System.out.println();

        today.add(Calendar.DAY_OF_MONTH, 1);

        System.out.println("Tomorroy will be day " + today.get(Calendar.DAY_OF_MONTH));

        System.out.println("Last month was " + today.get(Calendar.MONTH));
    }
}
