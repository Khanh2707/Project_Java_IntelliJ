package File;

public class Thread3 extends Thread {
    Data d;

    public Thread3(Data d) {
        this.d = d;
    }

    public void run() {
        while (true) {
            synchronized (d) {
                System.out.println("te3");
                d.notifyAll();
                while (d.getIndex() != 3 && d.isCheck()) {
                    try {
                        System.out.println("t3");
                        d.wait();
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (!d.isCheck()) {
                    break;
                }
                int num = d.getNum();
                System.out.println("Bình phương của "+num+": "+(num*num));
                d.setIndex(1);
            }
        }
        System.out.println("T3 stop");
        synchronized (d) {
            stop();
        }
    }
}
