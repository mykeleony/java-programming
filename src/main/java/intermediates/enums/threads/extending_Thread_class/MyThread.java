package intermediates.enums.threads.extending_Thread_class;

public class MyThread extends Thread {

    private String name;
    private int time;

    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;

        start();
    }

    public void task() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(name + "#" + i);
                Thread.sleep(time);
            }

            System.out.println(name + " has finished its task.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        task();
    }
}
