package basics.threads.resource_sharing;

public class TicTacThread implements Runnable {

    private TicTac ticTac;
    private Thread thread;
    private final int ITERATONS = 5;

    public TicTacThread(String threadName, TicTac ticTac) {
        this.ticTac = ticTac;

        thread = new Thread(this, threadName);
        thread.start();
    }

    @Override
    public void run() {
        if (thread.getName().equalsIgnoreCase("tic")) {
            for (int i = 0; i < ITERATONS; i++)
                ticTac.tic(true);

            ticTac.tic(false);
        }

        else {
            for (int i = 0; i < ITERATONS; i++)
                ticTac.tac(true);

            ticTac.tac(false);
        }
    }

    public TicTac getTicTac() {
        return ticTac;
    }

    public void setTicTac(TicTac ticTac) {
        this.ticTac = ticTac;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public int getITERATONS() {
        return ITERATONS;
    }
}
