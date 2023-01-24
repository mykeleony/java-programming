package advanced.behavior_parametrization.without_lambda;

public class PrintColorWeightHeavy implements ApplePrintStrategy {

    @Override
    public String output(Apple apple) {
        String characteristic = (apple.getWeight() > 150) ? "heavy" : "light";

        return String.format("A %s %s apple.", characteristic, apple.getColor().toLowerCase());
    }

}
