package advanced.behavior_parametrization;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Apple a1 = new Apple(150, "Green");
        Apple a2 = new Apple(192, "Red");

        List<Apple> apples = Arrays.asList(a1, a2);

        Apple.prettyPrintApple(apples, new PrintAppleWeightAndColor());
        Apple.prettyPrintApple(apples, new PrintAppleWeight());
        Apple.prettyPrintApple(apples, new PrintColorWeightHeavy());
    }
}
