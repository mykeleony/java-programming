package advanced.comparator.with_anonymous_classes;

import advanced.comparator.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tablet", 1400.0));
        products.add(new Product("iPhone SLA", 9999.99));
        products.add(new Product("Idk", 123.123));

        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                String p1Name = o1.getName().toLowerCase();
                String p2Name = o2.getName().toLowerCase();

                return p1Name.compareTo(p2Name);
            }
        });

        for(Product p : products)
            System.out.println(p);
    }

}
