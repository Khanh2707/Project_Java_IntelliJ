package Addition;

import java.util.Scanner;

public class Output extends Thread {
    private Data d;

    public Output(Data d) {
        this.d = d;
    }

    public void run() {
        while (d.isRunning()) {
            synchronized (d) {
                try {
                    d.wait();
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                int a = d.get();
                if (a == 0) {
                    d.setRunning(false);
                    d.notify();
                    break;
                }
                int b = d.get();
                System.out.println("Add = " +(a+b));
                d.setIndex(1);
                d.notify();
            }
        }
    }
}
