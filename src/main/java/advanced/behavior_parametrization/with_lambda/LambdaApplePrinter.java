package advanced.behavior_parametrization.with_lambda;

import advanced.behavior_parametrization.without_lambda.Apple;

import java.util.Arrays;
import java.util.List;

public class LambdaApplePrinter {

    public static void main(String[] args) {
        Apple a1 = new Apple(156, "orange");
        Apple a2 = new Apple(607, "purple");

        List<Apple> apples = Arrays.asList(a1, a2);

        Apple.prettyPrintApple(apples, a -> String.format("A %s apple of %dg", a.getColor(), a.getWeight())); 
    }

}
