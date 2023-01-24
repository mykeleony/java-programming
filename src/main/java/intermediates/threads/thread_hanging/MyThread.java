package intermediates.threads.thread_hanging;

/**
 Date: 01/05/2023
 Author: Myke Amorim
 This Java program implements the suspend, resume, and stop methods, which were removed in Java 2.
 These methods allow a Thread to be suspended, resumed, or interrupted during execution.
 While they are no longer recommended for use due to synchronization issues and potential deadlocks, they are still important in terms of understanding the history of the Java language.
 */

public class MyThread implements Runnable {
    private String name;
    private boolean isSuspended = false;
    private boolean isFinished = false;

    public MyThread(String name) {
        this.name = name;

        new Thread(this, name).start();
    }

    void suspend() {
        isSuspended = true;
    }

    synchronized void resume() {
        isSuspended = false;
        notify();
    }

    synchronized void stop() {
        isFinished = true;
        notify();
    }

    @Override
    public void run() {
        System.out.println("Executing " + name);

        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Thread " + name + " #" + i);
                Thread.sleep(300);

                synchronized (this) {
                    while (isSuspended)
                        wait();

                    if (isFinished)
                        break;
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(name + " finished.");
    }
}
