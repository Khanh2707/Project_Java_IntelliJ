package DemNguoc;

public class Thread1 extends Thread {
    private int num;
    public Thread1(int num) {
        this.num = num;
    }

    public void run() {
        while (num >= 0) {
            System.out.println("\33[31mcount: " +num--);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
