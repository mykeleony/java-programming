package basics.threads.synchronized_elements;

import basics.data_structures.Array;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        MyCalculatorThread t1 = new MyCalculatorThread("t1", numbers);
        MyCalculatorThread t2 = new MyCalculatorThread("t2", numbers);
    }
}
