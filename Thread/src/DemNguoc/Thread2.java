package DemNguoc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread2 extends Thread {
    private int num;
    public Thread2(int num) {
        this.num = num;
    }

    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        while (num >= 0) {
                System.out.println("\33[34m"+dateFormat.format(new Date()));
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            num--;
        }
    }
}
