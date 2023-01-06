package basics.enums.wrong_usecase;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        usingConstants();
    }

    private static void usingConstants() {
        int monday = DaysOfTheWeek.MONDAY;
        int tuesday = DaysOfTheWeek.TUESDAY;
        int wednesday = DaysOfTheWeek.WEDNESDAY;
        int thursday = DaysOfTheWeek.THURSDAY;
        int friday = DaysOfTheWeek.FRIDAY;
        int saturday = DaysOfTheWeek.SATURDAY;
        int sunday = DaysOfTheWeek.SUNDAY;

        List<Integer> days = Arrays.asList(monday, tuesday, wednesday, thursday, friday, saturday, sunday);

        for (Integer day : days)
            printDayOfTheWeek(day);
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This day does not exist. Please insert a valid one and try again.");
                break;
        }
    }
}
