package intermediates.threads.synchronized_elements;

public class Calculator {
    private int sum;

    public synchronized int sumArray(int[] numbers) {
        sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            System.out.println(Thread.currentThread().getName() + " summing " + numbers[i] + " within the current total of " + sum);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return sum;
    }

}
