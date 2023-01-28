package advanced.functional_interfaces.function;

import advanced.comparator.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuncTest {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("iPhone", 1000.0));
        products.add(new Product("Computer", 3000.0));
        products.add(new Product("Tablet", 950.0));
        products.add(new Product("Screen", 200.0));
        products.add(new Product("Xbox", 2000.0));

        //List<String> newNames = products.stream().map(new UppercaseNameFunction()).toList();
        //List<String> newNames = products.stream().map(Product::staticToUppercaseName).toList();
        //List<String> newNames = products.stream().map(Product::nonStaticToUppercaseName).toList();

        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> newNames = products.stream().map(func).toList();

        //List<String> newNames = products.stream().map(p -> p.getName().toUpperCase()).toList();
    }

}
