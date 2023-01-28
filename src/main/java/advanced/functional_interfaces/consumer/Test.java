package advanced.functional_interfaces.consumer;

import advanced.comparator.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Seila", 1000.0));
        products.add(new Product("Seila2", 100.0));
        products.add(new Product("Seila3", 150.14));
        products.add(new Product("Seila4", 200.0));
        products.add(new Product("Seila5", 154.14));

        System.out.println("Before forEach: ");
        products.forEach(System.out::println);


        System.out.println("After forEach: ");
        //products.forEach(new PriceUpdateConsumer());
        //products.forEach(System.out::println);
        //products.forEach(Product::staticUpdatePriceConsumer);
        //products.forEach(Product::nonStaticUpdatePriceConsumer);
        double factor = 1.1;
        Consumer<Product> cons = p -> {
          p.setPrice(p.getPrice() * factor);
        };
        products.forEach(cons);
        //products.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        products.forEach(System.out::println);
    }

}
