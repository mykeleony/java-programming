package intermediates.util_classes.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatAndLocale {
    public static void main(String[] args) {
        Date today = new Date();

        System.out.println("Default locale: " + Locale.getDefault());
        Locale.setDefault(new Locale("pt", "Brazil"));
        System.out.println("New default locale: " + Locale.getDefault());

        String formattedToday = DateFormat.getInstance().format(today); // dd/MM/YYYY hh:mm
        System.out.println(formattedToday);

        formattedToday = DateFormat.getTimeInstance().format(today);    // hh:mm:ss
        System.out.println(formattedToday);

        formattedToday = DateFormat.getDateInstance().format(today);    // dd de MMM. de YYYY
        System.out.println(formattedToday);

        formattedToday = DateFormat.getDateTimeInstance().format(today);    // dd de MMM. de YYYY hh:mm:ss
        System.out.println(formattedToday);

        // Defining styles on DateFormat instances
        formattedToday = DateFormat.getTimeInstance(DateFormat.LONG).format(today);
        System.out.println(formattedToday);

        // Mixing styles
        formattedToday = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.LONG).format(today);
        System.out.println(formattedToday);

        // For string -> date conversion, the string format must be the same as the default locale one
        String randomDate = "11/05/2002 12:22";

        try {
            Date otherDate = DateFormat.getInstance().parse(randomDate);

            System.out.println(otherDate);

            // Converting date into calendar
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(otherDate);

            System.out.println(calendar);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
