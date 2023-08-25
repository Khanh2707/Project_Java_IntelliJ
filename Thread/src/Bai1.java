import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai1 {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                while (true) {
                    System.out.println("\33[31m"+sdf.format(new Date()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();
    }
}