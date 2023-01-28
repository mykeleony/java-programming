package advanced.functional_interfaces.customized;

import advanced.comparator.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("iPhone", 1000.0));
        products.add(new Product("TV", 3000.0));
        products.add(new Product("Tablet", 950.0));
        products.add(new Product("Screen", 200.0));
        products.add(new Product("Xbox", 2000.0));

        Predicate<Product> startsWithTPredicate = p -> p.getName().toLowerCase().startsWith("t");

        double sumOfProductsStartedWithT = ProductService.filteredSum(products, startsWithTPredicate);

        System.out.println("Sum of all products that start with t: " + sumOfProductsStartedWithT);
    }

}
