package basics.enums.value_methods;

import basics.enums.usecase_with_enums.EnumDaysOfTheWeek;

/*
 * Date: 06/01/2023
 * Author: Myke Amorim
 *
 * Program that makes use of the methods values() and valueOf() of Enums.
 */

public class EnumTest {
    public static void main(String[] args) {
        // Getting all values inside the enum
        EnumDaysOfTheWeek[] days = EnumDaysOfTheWeek.values();

        // Getting a particular element of the enum based on a String
        EnumDaysOfTheWeek day = Enum.valueOf(EnumDaysOfTheWeek.class, "MONDAY");

        // Enhanced for that iterates through all values of the enum
        for (EnumDaysOfTheWeek d : days)
            System.out.println(d);

        System.out.println("----------------");

        // Converting each enum element into a String so its content can me manipulated
        for (EnumDaysOfTheWeek d : days)
            System.out.println(d.toString().toLowerCase());
    }
}
