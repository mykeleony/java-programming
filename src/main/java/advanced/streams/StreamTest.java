package advanced.streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        Stream<Integer> stream = integers.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream.toArray()));

        Stream<String> stream2 = Stream.of("Opa", "Oie", "Uiuiui", "Cavalo");
        System.out.println(Arrays.toString(stream2.toArray()));

        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));

    }

}
