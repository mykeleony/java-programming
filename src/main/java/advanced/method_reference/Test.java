package advanced.method_reference;


import intermediates.generics.delimited_generics.Product;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static int compareProducts(Product p1, Product p2) {
        return p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Seila", 1000.0));
        products.add(new Product("Seila2", 10123.0));
        products.add(new Product("Seila3", 141.14));

        products.sort(Test::compareProducts);
    }

}
