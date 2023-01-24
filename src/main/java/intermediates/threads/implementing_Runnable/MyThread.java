package intermediates.threads.implementing_Runnable;

public class MyThread implements Runnable {
    private String name;
    private int time;

    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void task() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + "#" + i);

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
