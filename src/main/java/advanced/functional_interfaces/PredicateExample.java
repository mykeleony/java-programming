package advanced.functional_interfaces;

import advanced.comparator.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Seila", 1000.0));
        products.add(new Product("Seila2", 10123.0));
        products.add(new Product("Seila3", 141.14));
        products.add(new Product("Seila4", 2.14));
        products.add(new Product("Seila5", 15.14));

        //products.removeIf(new MyCustomizedPredicate());
        //products.removeIf(Product::staticIsTooExpensivePredicate);
        //products.removeIf(Product::nonStaticIsTooExpensivePredicate);

        double max = 100.0;

        Predicate<Product> predicate = product -> product.getPrice() >= max;
        products.removeIf(p -> p.getPrice() >= max);

        System.out.println(products);
    }

}
