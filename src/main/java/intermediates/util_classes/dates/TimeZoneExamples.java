package intermediates.util_classes.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExamples {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();

        System.out.println(tz);

        // String[] availableIDs = TimeZone.getAvailableIDs();

        TimeZone tzParis = TimeZone.getTimeZone("Europe/Paris");
        System.out.println(tzParis.getDisplayName());
        System.out.println(tzParis.getID());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");

        Calendar nowParis = Calendar.getInstance(tzParis);  // Doesn't change the hour, only the TimeZone
        System.out.println(sdf.format(nowParis.getTime()));
        nowParis.add(Calendar.HOUR_OF_DAY, tzParis.getOffset((System.currentTimeMillis() / 1000 / 60 / 60)) * -1);   // Changes hour manually
        System.out.println(sdf.format(nowParis.getTime()));
    }
}
