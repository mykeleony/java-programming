package intermediates.generics.wildcards.bounded_wildcards;

import java.util.List;

public class AreasSummer {

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0;

        for (Shape s : list)
            sum += s.area();

        return sum;
    }

}
