package basics.data_types;

import java.net.SocketTimeoutException;

public class Numeric {
    public static void main(String[] args) {
        /* Primary or primitive */
        long l1 = 1L;   // Larger integer.
        int i1 = 1;
        short s1 = 1;   // Smaller integer.
        byte b1 = 1;    // Smallest integer possible.
        char c1 = 0;
        char c97 = 'a';     // Chars must be contained between simple commas.
        double d1 = 1.0;
        float f1 = 1.0f;    // Java defines double as default for decimal numbers. Therefore, we must explicitly use the 'f' character before the semicolon of a float value.

        /* Not primary, which uses predefined classes. Utilizes more memory than primitive types. */
        Integer i2 = 1;
        Short s2 = 1;
        Float f2 = 1.0F;
        Double d2 = 1.0;
        Byte b2 = 1;

        System.out.println("Sizes: ");
        System.out.println("long: " + Long.MIN_VALUE);
        System.out.println("long: " + Long.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE);
        System.out.println("int: " + Integer.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE);
        System.out.println("short: " + Short.MAX_VALUE);
        System.out.println("byte: " + Byte.MIN_VALUE);
        System.out.println("byte: " + Byte.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE);
        System.out.println("double: " + Double.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE);
        System.out.println("float: " + Float.MAX_VALUE);
    }
}
