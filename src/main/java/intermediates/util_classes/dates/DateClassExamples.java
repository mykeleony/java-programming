package intermediates.util_classes.dates;

import java.util.Date;

public class DateClassExamples {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.println(now);
        System.out.println("Milliseconds since 1970: " + now.getTime());
        System.out.println(now.getDate());  // Use calendar instead
    }
}
