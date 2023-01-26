import java.util.List;
import java.util.function.Function;

public class Apple {

    private String color;
    private int weight;

    public static void prettyPrintApple(List<Apple> inventory, Function<Apple, Void> function) {
        for (Apple a : inventory) {
            System.out.println(function.apply(a));
        }
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
