package intermediates.enums.threads.thread_priorities;

public class Test {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable("r1", 1000);
        MyRunnable r2 = new MyRunnable("r2", 300);
        MyRunnable r3 = new MyRunnable("r3", 500);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.setPriority(5);                      // Default priority.
        t2.setPriority(Thread.MAX_PRIORITY);    // 10 is max priority
        t3.setPriority(Thread.MIN_PRIORITY);    // 1 is the min priority

        t1.start();
        t2.start();
        t3.start();
    }
}
