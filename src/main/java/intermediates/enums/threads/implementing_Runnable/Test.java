package intermediates.enums.threads.implementing_Runnable;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("t1", 1000);
        MyThread t2 = new MyThread("t2", 450);
        MyThread t3 = new MyThread("t3", 200);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Program ended.");
    }

}
