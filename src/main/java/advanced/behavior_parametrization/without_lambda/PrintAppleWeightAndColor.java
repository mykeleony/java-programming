package advanced.behavior_parametrization.without_lambda;

public class PrintAppleWeightAndColor implements ApplePrintStrategy {
    @Override
    public String output(Apple apple) {
        return String.format("%s apple with %dg", apple.getColor(), apple.getWeight());
    }
}
