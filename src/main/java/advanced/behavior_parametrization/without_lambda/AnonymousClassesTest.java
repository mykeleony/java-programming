package advanced.behavior_parametrization.without_lambda;

import java.util.Arrays;
import java.util.List;

public class AnonymousClassesTest {
    public static void main(String[] args) {
        Apple a1 = new Apple(140, "white");
        Apple a2 = new Apple(230, "blue");

        List<Apple> apples = Arrays.asList(a1, a2);

        Apple.prettyPrintApple(apples, new ApplePrintStrategy() {
            @Override
            public String output(Apple apple) {
                return String.format("That's a %s colored apple of %dg", apple.getColor(), apple.getWeight());
            }
        });
    }
}
