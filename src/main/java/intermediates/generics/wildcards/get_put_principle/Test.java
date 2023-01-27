package intermediates.generics.wildcards.get_put_principle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(1.2, 1.3, 1.4);
        List<Object> objs = new ArrayList<>();

        copy(ints, objs);

        System.out.println(objs);

        copy(doubles, objs);

        System.out.println(objs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        destiny.addAll(source);
    }

}
