package intermediates.generics.wildcards.bounded_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        list.add(new Rectangle(10.0, 14.0));
        list.add(new Circle(123.123));

        System.out.printf("Total area: %.2f", AreasSummer.totalArea(list));
    }

}
