package basics.threads.extending_Thread_class;

public class Test {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1", 400);
        MyThread t2 = new MyThread("t2", 600);
        MyThread t3 = new MyThread("t3", 100);
    }

}
