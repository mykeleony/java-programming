package basics.threads.synchronized_elements;

public class MyCalculatorThread implements Runnable {
    private String name;
    private int[] numbers;
    private static Calculator calculator = new Calculator();

    public MyCalculatorThread(String name, int[] numbers) {
        this.name = name;
        this.numbers = numbers;

        new Thread(this, name).start();
    }

    @Override
    public void run() {
        System.out.println(name + " started.");

        int sum = calculator.sumArray(numbers);

        System.out.println(name + " finished. Sum is: " + sum);
    }
}
