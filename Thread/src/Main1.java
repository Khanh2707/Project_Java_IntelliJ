

public class Main1 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread("thread 1");
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        for (int i = 0; i < 7; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println(t.getState());
    }
}
