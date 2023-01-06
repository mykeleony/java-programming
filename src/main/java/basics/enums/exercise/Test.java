package basics.enums.exercise;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        for(Calculator c : Calculator.values()) {
            // Generates two random numbers between 1 and 10 for each operation
            int n1 = new Random().nextInt(1, 10);
            int n2 = new Random().nextInt(1, 10);

            System.out.println("Result of " + n1 + c + n2 + " is " + c.executeOperation(n1, n2));
        }
    }
}
