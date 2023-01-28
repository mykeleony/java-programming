package advanced.functional_interfaces;

import advanced.comparator.Product;

import java.util.function.Predicate;

public class MyCustomizedPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }

}
