package advanced.streams.pipelines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PipelineCreator {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> st1 = list.stream().map(x -> x * 2);
        //System.out.println(Arrays.toString(st1.toArray()));

        System.out.println(list);
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum = " + sum);

        List<Integer> list2 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> (int) Math.pow(x, 2))
                .toList();

        System.out.println("Even ^ 2: " + list2);
    }

}
