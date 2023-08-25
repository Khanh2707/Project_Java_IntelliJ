package Addition;

import java.util.Scanner;

public class Input extends Thread {
    private Data d;

    public Input(Data d) {
        this.d = d;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (d.isRunning()) {
            synchronized (d) {
                System.out.println("Nhập a: ");
                int a = sc.nextInt();
                d.add(a);
                if (a == 0) {
                    d.setRunning(false);
                    d.notify();
                    break;
                }
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Nhập b: ");
                int b = sc.nextInt();
                d.add(b);
                d.setIndex(2);
                d.notify();
                try {
                    d.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
