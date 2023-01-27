package intermediates.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        //objectList = integerList;   // Compilation error. Generics are invariant.

        List<?> listOfAnything = new ArrayList<>();
        listOfAnything = integerList;
        //listOfAnything.add(123);    // Impossible to add itens to wildcard collections.
    }
}
