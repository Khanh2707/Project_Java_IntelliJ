package DeamonThread;

public class Deamon extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i++);
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
