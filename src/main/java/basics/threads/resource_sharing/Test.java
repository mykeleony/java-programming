package basics.threads.resource_sharing;

public class Test {
    public static void main(String[] args) {
        TicTac ticTac = new TicTac();

        TicTacThread tic = new TicTacThread("tic", ticTac);
        TicTacThread tac = new TicTacThread("tac", ticTac);

        try {
            tic.getThread().join();
            tac.getThread().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
