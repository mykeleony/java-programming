package intermediates.enums.threads.resource_sharing;

/**
 Date: 01/05/2023
 Author: Myke Amorim
 This Java program utilizes two synchronized threads to print out the repeating sequence: "Tic Tac Tic Tac..."..
 */
public class TicTac {
    private boolean tic;

    public synchronized void tic (boolean isExecuting) {
        if (!isExecuting) {
            tic = true;
            notify();
            return;
        }

        System.out.print("Tic");
        tic = true;
        notify();

        try {
            while(tic)
                wait();
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void tac (boolean isExecuting) {
        if (!isExecuting) {
            tic = false;
            notify();
            return;
        }

        System.out.println(" tac");
        tic = false;
        notify();

        try {
            while(!tic)
                wait();
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
