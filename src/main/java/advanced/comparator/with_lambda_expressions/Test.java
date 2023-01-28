package advanced.comparator.with_lambda_expressions;

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

        products.sort((p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));

        for(Product p : products)
            System.out.println(p);
    }

}
