package advanced.behavior_parametrization.without_lambda;

public class PrintAppleWeight implements ApplePrintStrategy {
    @Override
    public String output(Apple apple) {
        return String.format("Apple with %dg", apple.getWeight());
    }
}
