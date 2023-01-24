package advanced.behavior_parametrization;

public class PrintColorWeightHeavy implements ApplePrintStrategy {

    @Override
    public String output(Apple apple) {
        String characteristic = (apple.getWeight() > 150) ? "heavy" : "light";

        return String.format("A %s %s apple.", characteristic, apple.getColor().toLowerCase());
    }

}
