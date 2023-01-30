package advanced.streams.pipelines.products_exercise;

/*
* Program that reads a file containing several products separate by line, which have its names and prices
* separated by commas, calculates the average price and list the products (descending) below the average.
*
* by Myke Amorim. 30/01/2023.
* */

import advanced.comparator.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {
        String filePath = "src/main/java/advanced/streams/pipelines/Products";
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();

            while(line != null) {
                String[] elements = line.split(",");

                products.add(new Product(elements[0], Double.parseDouble(elements[1])));

                line = br.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }

        double avg = products.stream().map(Product::getPrice)
                        .reduce(0.0, Double::sum) / products.size();

        System.out.printf("Average price is: $%.2f%n", avg);
        System.out.println("Products below the average: ");

        Comparator<Product> comp = Comparator.comparing(s -> s.getName().toLowerCase());

        products.stream()
                .filter(p -> p.getPrice() < avg)
                .sorted(comp.reversed())
                .map(Product::getName)
                .forEach(System.out::println);
    }

}
