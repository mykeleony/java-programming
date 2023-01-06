package basics.enums.enums_as_classes;

public class Test {
    public static void main(String[] args) {
        for (WeekDays day : WeekDays.values())
            System.out.println(day.toString() + " - " + day.getValue());
    }
}
