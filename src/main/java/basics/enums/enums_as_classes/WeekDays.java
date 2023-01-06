package basics.enums.enums_as_classes;

/**
 * Author: Myke Amorim
 * Date: January 5, 2023
 *
 * This file contains an enumerator that represents the days of the week and uses class resources in enumerators.
 * It was created to make it easier to work with days of the week in Java projects.
 */

public enum WeekDays {
    // Defining constructors for each value.
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private int value;

    WeekDays(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
