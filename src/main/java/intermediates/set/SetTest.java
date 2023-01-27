package intermediates.set;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();  // Does not guarantee the order.

        set.add("myke");
        set.add("ana");
        set.add("Reinaldo");

        System.out.println(set.contains("Reinaldo"));

        set.removeIf(name -> name.startsWith("a"));

        for (String p : set)
            System.out.println(p);

        System.out.println("Operations: ");

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 8, 9, 10));

        System.out.println("Union");
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        System.out.println("Intersection");
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        System.out.println("Difference");
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }

}
