package intermediates.util_classes.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDateFormatExamples {
    public static void main(String[] args) {
        // 2M = month with 2 digits
        // 3M = month wiht its 3 first letters
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY, HH:mm:ss:SS, z");

        // 11/05/2002 at 11:44
        Calendar date = new GregorianCalendar(2002, 4, 11, 11, 44);
        Calendar now = Calendar.getInstance();

        System.out.println(sdf.format(now.getTime()));

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY");
        String myDate = "12/04/1995";

        try {
            Date myDateInDate = sdf2.parse(myDate);
            System.out.println(sdf.format(myDateInDate));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
