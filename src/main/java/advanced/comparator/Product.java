package advanced.comparator;

import java.util.Locale;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticIsTooExpensivePredicate(Product p) {
        return p.getPrice() >= 100;
    }

    public boolean nonStaticIsTooExpensivePredicate() {
        return price >= 100.0;
    }

    public static void staticUpdatePriceConsumer(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticUpdatePriceConsumer() {
        setPrice(getPrice() * 1.1);
    }

    public static String staticToUppercaseName(Product p) {
        return p.getName().toUpperCase();
    }

    public String nonStaticToUppercaseName() {
        return getName().toUpperCase();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
