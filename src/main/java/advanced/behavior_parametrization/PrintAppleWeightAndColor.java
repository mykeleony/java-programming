package advanced.behavior_parametrization;

public class PrintAppleWeightAndColor implements ApplePrintStrategy {
    @Override
    public String output(Apple apple) {
        return String.format("%s apple with %dg", apple.getColor(), apple.getWeight());
    }
}
