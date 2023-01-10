package intermediates.printf;

import com.sun.security.jgss.GSSUtil;

public class PrintfExamples {
    public static void main(String[] args) {
        String world = "world";

        System.out.printf("Hello %s %n", world);    // %s = String, %n = line break
        System.out.printf("Hello %s %n", "world");

        System.out.printf("%S %n", "Hello world!");    // %S transforms the text to its uppercase version.
        System.out.printf("%C %n", 'c');

        int value = -1234567;
        System.out.printf("%d", value);

        double doubleValue = 1.23;
        System.out.printf("%f", doubleValue);
        System.out.println();

        String helloWorld = "Hello, world!";
        System.out.printf("%20s", helloWorld);  // The minimum lenght is 20. When the string is less than 20, spaces are added at the left side.
        System.out.println();
        System.out.printf("%-20s", helloWorld); // Adds spaces at the right side.
        System.out.println();

        System.out.printf("%+d", value);    // Explicitly puts "+" character
        System.out.println();

        value = -value;

        System.out.printf("%+d", value);    // Explicitly puts "-" character
        System.out.println();

        System.out.printf("%015d", value);  // The number must have 15 digits, and the 0 after the percentage indicates that the missing digits must be filled with zeros.
        System.out.println();

        System.out.printf("%,d", value);    // Inserts the commas in million values
        System.out.println();

        System.out.printf("% d", value);    // % d only inserts the signal when the value is negative
        System.out.println();
        System.out.printf("% d", - value);  // When positive, it inserts a space before the value
        System.out.println();

        System.out.printf("%.1f", doubleValue);     // Only 3 decimal digits
        System.out.println();

        completeTest();
    }

    private static void completeTest() {
        double[] prices = {100.0, 123.54, 1.23, 50.1, 300.0};

        for (int i = 0; i < prices.length; i++) {
            System.out.printf("Item %02d: total of $%,10.2f%n", (i + 1), prices[i]);
        }
    }
}
