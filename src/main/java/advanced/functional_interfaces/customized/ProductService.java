package advanced.functional_interfaces.customized;

import advanced.comparator.Product;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductService {

    public static double filteredSum(List<Product> products, Predicate<Product> condition) {
        List<Product> filteredProducts = products.stream().filter(condition).toList();

        double sum = 0;

        for(Product p : filteredProducts) {
            sum += p.getPrice();
        }

        return sum;
    }

}
