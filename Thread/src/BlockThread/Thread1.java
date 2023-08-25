package BlockThread;

public class Thread1 extends Thread {
    public void run() {
        Block.block();
    }
}
