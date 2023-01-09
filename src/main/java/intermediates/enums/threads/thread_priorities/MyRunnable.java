package intermediates.enums.threads.thread_priorities;

public class MyRunnable implements Runnable {

    private String name;
    private int time;

    public MyRunnable(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void task() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " #" + i);

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(name + " has finished its task.");
    }

    @Override
    public void run() {
        task();
    }
}
