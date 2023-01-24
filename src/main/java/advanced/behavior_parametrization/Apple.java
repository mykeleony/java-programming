package advanced.behavior_parametrization;

import java.util.List;


public class Apple {

    private int weight;
    private String color;

    public static void prettyPrintApple(List<Apple> inventory, ApplePrintStrategy aps) {
        for(Apple apple : inventory) {
            System.out.println(aps.output(apple));
        }
    }

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
