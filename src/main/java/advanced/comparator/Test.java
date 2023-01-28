package advanced.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tablet", 1400.0));
        products.add(new Product("iPhone SLA", 9999.99));
        products.add(new Product("Idk", 123.123));

        products.sort(new ProductComparator());

        for(Product p : products)
            System.out.println(p);
    }

}
