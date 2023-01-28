package advanced.functional_interfaces.function;

import advanced.comparator.Product;

import java.util.Locale;
import java.util.function.Function;

public class UppercaseNameFunction implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
