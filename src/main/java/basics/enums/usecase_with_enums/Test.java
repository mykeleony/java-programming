package basics.enums.usecase_with_enums;

import basics.enums.wrong_usecase.DaysOfTheWeek;

public class Test {
    public static void main(String[] args) {
        // Accessing enum values
        EnumDaysOfTheWeek monday = EnumDaysOfTheWeek.MONDAY;
        int tuesday = EnumDaysOfTheWeek.TUESDAY.ordinal();
        String wednesday = EnumDaysOfTheWeek.WEDNESDAY.toString();

        System.out.println(monday);
        System.out.println(tuesday);
        System.out.println(wednesday.toLowerCase());

        printAllDays();
    }

    public static void printAllDays () {
        System.out.println("Printing everything in lower case within the enum in a simple way: ");

        for (EnumDaysOfTheWeek day : EnumDaysOfTheWeek.values())
            System.out.println(day.toString().toLowerCase());
    }
}
