package File;

public class Thread2 extends Thread {
    Data d;

    public Thread2(Data d) {
        this.d = d;
    }

    public void run() {
        while (true) {
            synchronized (d) {
                System.out.println("te2");
                d.notifyAll();
                while (d.getIndex() != 2 && d.isCheck()) {
                    try {
                        System.out.println("t2");
                        d.wait();
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
                if (!d.isCheck()) {
                    break;
                }
                int num = d.getNum();
                System.out.println("Ước "+num+": ");
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        System.out.println(i);
                    }
                }
                d.setIndex(1);
            }
        }
        System.out.println("T2 stop");
        synchronized (d) {
            stop();
        }
    }
}
